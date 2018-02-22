package GoogleChallenges;
/*
 * @anuja.nagare@uga.edu
 * Given: string as input 
 * s = "hello", return "holle". 
 * Given s = "leetcode", return "leotcede". 
 * soln:
 * - convert string to string array
 * - create one more string array of the same length
 * - go thru string from start to end when u see vowel store it in temp and save its index position and start looking for vowel from the end once u find it replace it with stored vowel
 * 
 */
public class Reverse_Vowels_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		
		char[] cArr= s.toLowerCase().toCharArray();
		
		int i=s.length()-1;
		for (char c: cArr) {
			if (c == 'a' || c == 'e'||c == 'i'||c == 'o'||c == 'u' || cArr[i] == 'a' || cArr[i] == 'e'|| cArr[i] == 'i'||cArr[i] == 'o'||cArr[i] == 'u') {
				
			}
			i--;
		}//for

	}

}
