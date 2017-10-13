//author : Anuja Nagare anuja.nagare@uga.edu

import java.util.Scanner;
import java.util.Stack;

/*
 * Task:
 * Given a base-10 integer, n, convert it to binary (base-2). 
 * Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
 */
public class binary_num_challenge {

	static Scanner sc = new Scanner(System.in);
//	static Stack<Integer> s = new Stack();

//	//	binary converter 
//	public static Stack<Integer> binary_convertor(int n) {
//		int remainder;
//		while(n>0) {
//			remainder = n%2;
//			n = n/2;
//			s.push(remainder);	
//		}//while		
//		return s;
//	}

	public static void main(String args[]) {

		int n = sc.nextInt();
		//		binary_convertor(n);
		//		
		//		int count =-1;
		//		String c;
		//		int l = s.size();
		//		System.out.println(s);
		//		
		//		for (int i=0; i<l;i++) {
		//			c =s.peek().toString();
		//			if (c.equals("1")) {
		//				count= count+1;
		//			}//if
		//			s.pop();
		//		}//for 
		//
		//		System.out.println(count);

//		solution without using stack
		int rem=0,s=0,t=0;
		while(n>0){
			rem=n%2;
			n=n/2;
			
			if(rem==1)
			{   
				s++;
				if(s>=t)
					t=s;
			}//if
			else{
				s=0;
			} //else  
		}//while
		System.out.println(t);

	}
}