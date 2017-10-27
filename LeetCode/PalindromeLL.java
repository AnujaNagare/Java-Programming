// anuja.nagare@uga.edu
package LeetCode_2610;

import java.util.*;

public class PalindromeLL {

	// using string as input find if it is a palindrome
	public static boolean palindromCheckerString(String str) {
		boolean flag = false;
		str = str.toLowerCase();
		str = str.replaceAll("[^a-zA-Z0-9]", "");

		//alternative way to remove special characters
		// for ( char c : s.toCharArray()) {
		// 	if(Character.isAlphabetic(c) || Character.isDigit(c) ) {
		// 	str = str+c;
		// 	}
		// }

		for (int i=0; i < str.length()/2 ; i++ ) {
			if (str.charAt(i) !=str.charAt(str.length()-1-i)) {
				flag=true;
				break;
			}//if
		}//for

		return flag;
	}

	// using linked list as input find if it is a palindrome
	public static boolean palindromCheckerLL(LinkedList ll) {
		boolean flag = false;

		for (int i=0; i < ll.size()/2 ; i++ ) {
			if (ll.get(i) !=ll.get(ll.size()-1-i)) {
				flag=true;
				break;
			}//if
		}//for
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A man, a plan, a canal: Panama";

		boolean flag = palindromCheckerString(str);

//		LinkedList ll = new LinkedList<>();
//
//		ll.add("a");
//		ll.add("s");
//		ll.add("d");
//		ll.add("s");
//		ll.add("a");
//
//		boolean flag = palindromCheckerLL(ll);

		if (flag == true) {
			System.out.println("Not Palindrome");
		}//if
		else {
			System.out.println("Palindrome");
		}//else

	}

}
