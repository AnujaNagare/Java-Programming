//anuja.nagare@uga.edu

import java.util.Random;

public class rand7Torand5 {

	public static int rand7() {
		Random rand = new Random();	
		int min = 1, max = 7;
		int  r = rand.nextInt(max) + min;
		return r;
	}
	
	public static int rand5() {
		
//		Solution 1
//		int  r = rand7()%5 + min;
//		return r;
		
//		Solution 2
		int roll = rand7();
	    return (roll <= 5) ? roll : rand5();
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rand5());
	}

}
