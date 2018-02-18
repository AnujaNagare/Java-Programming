//Fisher-Yates shuffle (sometimes called the Knuth shuffle). 

import java.util.Random;


/*
 * @anuja.nagare@uga.edu
 * task: in-place shuffle of array
 * 		shuffle must be "uniform"=> arrive at a random ordering of the items from the original array
 * 		
 * given: method getRandom(floor, ceiling)
 * 			getting a random integer that is >= floor and <= ceiling
 * 
 * 
 * Soln: //take an array of integers as input
 * 		//pick random value from array swap it with 1st place
 * 		// then pick next item and repeat same till end of array
 */
public class inPlaceShuffleof_Array {
	static int[] a = new int[5];
	static Random rand = new Random();

	public static void shuffle() {

		int ind, temp;
		
		for (int i=0;i <a.length;i++) {
			ind = getRandom(i);
			temp = a[i];
			a[i] = a[ind];
			a[ind] = temp;			
		}//for

	}//shuffle


	public static int getRandom(int min) {
		int max=a.length-1;

		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create array for random numbers
		for (int i=0;i <a.length;i++) {		
			a[i]=rand.nextInt(100);
			System.out.print(a[i]+"\t");
		}//for

		shuffle();
		System.out.println();

		for (int i=0;i <a.length;i++) {		
			System.out.print(a[i]+"\t");
		}//for
		//		System.out.println(random.nextInt(6));

	}

}
