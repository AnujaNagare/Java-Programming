// anuja.nagare@uga.edu

package LeetCode_2610;

import java.util.*;

public class isParanthesis_orNot {

	public static boolean isValid(String s) {
		boolean flag = true;
		Stack st = new Stack();


		for (char c : s.toCharArray()) {
			
			if (c == '(' || c == '{' || c == '[') {
				st.push(c);
			}//if 
			else if (!st.isEmpty()) {
				if ((c == ')' && (char) st.peek() == '(') || (c == '}' && (char) st.peek() == '{')
						|| (c == ']' && (char) st.peek() == '[')) {
					st.pop();
					flag = st.isEmpty();
				}//if
				else {
					flag = false;
					break;
				}
			}//if
			else if (c==')' || c=='}' || c==']'){
				flag = false; 
				break;
			}//if
		}//for 
		
		if (!st.isEmpty()) {
			flag = false; 
		}

		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(])";

		System.out.println(isValid(s));
	}
}
