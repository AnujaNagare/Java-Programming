//anuja.nagare@uga.edu

/*
 * Task:
 * Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers. 
 */

import java.io.*;
import java.util.*;

public class Array_Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		//        take input for array
		for(int i=0; i < n; i++){
			arr[i] = in.nextInt();
		}//for
		in.close();

//		print output
		for (int i=n-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}//for
	}
}	
