//author : Anuja Nagare anuja.nagare@uga.edu

/*
 * Task
 * Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
 * You will then be given an unknown number of names to query your phone book for. 
 * For each name queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; 
 * if an entry for name is not found, print Not found instead. 
 */

import java.util.*;
import java.io.*;

public class Dict_HashMap_Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phone_book = new HashMap<String,Integer>();

//		store values in hash table
		for(int i = 0; i < n; i++){
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			phone_book.put(name, phone);
		}//for
	
//		query and display phone book entries
		while(in.hasNext()){
			String s = in.next();
			// Write code here
			if (phone_book.containsKey(s)) {
				System.out.println(s +"=" +phone_book.get(s));
			}//if
			else {
				System.out.println("Not found");
			}//else
		}//while
		
		in.close();
	}

}




// sample i/p:
//3
//sam 99912222
//tom 11122222
//harry 12299933
//sam
//edward
//harry
