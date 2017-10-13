//author : Anuja Nagare anuja.nagare@uga.edu

/*
 * Task
 * Given a string S, of length N that is indexed from 0 to N-1, 
 * print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line.
 */


import java.io.*;
import java.util.*;

public class Part1_Review {

	static ArrayList<String> str1 = new ArrayList<String>();

	static Scanner sc = new Scanner(System.in);

	// extract even odd values from string 
	public static String extractEvenOddValues(String str) {
		String s = "";

		//		iterate through even index positions
		for ( int i=0; i<str.length();i++)
		{
			if (i%2==0) {
				s +=  str.charAt(i);		
			}//if
		}//for

		s += " ";

		//		iterate through odd index positions
		for ( int i=0; i<str.length();i++)
		{
			if (i%2!=0) {
				s +=  str.charAt(i);	
			}//if
		}//for

		return s;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = sc.nextInt();
		String s;

		//		take "n" number of strings as input
		for (int i=0;i<=n;i++) {
			String str = sc.nextLine();
			str1.add(str);
		}//for

		//iterate through all strings and print output
		for (int i=1;i<=n;i++) {
			s = extractEvenOddValues(str1.get(i));
			System.out.println(s);			
		}//for

	}

}

