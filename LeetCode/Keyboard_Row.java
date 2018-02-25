package Mathworks;

import java.util.*;

/*
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 */

public class Keyboard_Row {

	public static String[] l = { "asdfglkjh", "qwertpoiuy", "zxcvbnm" };

	public static String[] findWords(String[] words) {

		ArrayList<String> str =new ArrayList<String>();

		for (String s : words) {
			str.add(s);
		}//for

		for (String s : words) {
			int r = myHelperfunction(s.toLowerCase().charAt(0));			
			char[] temp = s.toLowerCase().toCharArray();
			for (char c : temp) {
				if (!l[r].contains(c + "")) {
					str.remove(str.indexOf(s));
					break;
				}//if
			}//for
		}//for

		//		System.out.println(str);

		String[] strArr = new String[str.size()];
		strArr = str.toArray(strArr);

		return strArr;
	}//findWords1

	private static int myHelperfunction(char c) {
		// TODO Auto-generated method stub
		for (int i = 0; i < l.length; i++) {
			if (l[i].contains(c + "")) {
				return i;
			}//if
		}//for
		return -1;
	}//myHelperfunction

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"Hello", "Alaska", "Dad", "Peace", "qwerty"};
		//		String[] words = {"asdfghjkla","qwertyuiopq","zxcvbnzzm","asdfghjkla","qwertyuiopq","zxcvbnzzm"};

		String[] strArr = findWords(words);
		for (String s:strArr) {
			System.out.println(s);
		}

	}

}
