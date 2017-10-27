// @author Anuja Nagare - anuja.nagare@uga.edu

import java.util.Scanner;

public class LinearSearchAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length of Array : ");
		int n = sc.nextInt();
		int[] a = new int[n];

		//		take n numbers as input from user
		for (int i=0;i<n;i++) {
			System.out.print("Enter the next element in the array: ");
			a[i] = sc.nextInt();	
		}//for

		System.out.print("Enter the number to be found: ");
		int b = sc.nextInt();

		int c;
		c = LinearSearchAlgo(b, a);
		if (c==-1)
			System.out.println("Given number not found in List!");
		else
			System.out.println("Given number is at position " + c + " in the list");

	}

	//	Linear Search Algorithm
	public static int LinearSearchAlgo(int b, int[] a)
	{

		int c = 0;
		// iterate over entire array
		for (int i=0; i < a.length; i++)		{
			if (b == a[i])			{	
				c=i;
				break;
			}//if
			else
				c=-1;
		}//for
		return c;
	}

}
