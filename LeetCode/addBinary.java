//anuja.nagare@uga.edu

package LeetCode_Easy;

/* Problem 1 : 25/10/2017 @anuja.nagare@uga.edu
 *  Given two binary strings, return their sum (also a binary string).
	For example,
	a = "11"
	b = "1"
	Return "100". 
 */
public class addBinary {

	static String addBinary(String a, String b) {

		int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
		String op = Integer.toBinaryString(sum).toString();

		return op;
	}//addBinary


//	static String addBinary(String a, String b) {
//
//		StringBuilder sb = new StringBuilder();
//		int i = a.length() - 1, j = b.length() -1, carry = 0;
//		while (i >= 0 || j >= 0) {
//			int sum = carry;
//			if (j >= 0) sum += b.charAt(j--) - '0';
//			if (i >= 0) sum += a.charAt(i--) - '0';
//			sb.append(sum % 2);
//			carry = sum / 2;
//		}
//		if (carry != 0) sb.append(carry);
//		return sb.reverse().toString();
//	}//addBinary

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="11", b ="1";

		System.out.println(addBinary(a,b));
	}

}
