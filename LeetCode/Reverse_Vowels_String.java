package GoogleChallenges;
/*
 * @anuja.nagare@uga.edu
 * Given: string as input 
 * s = "hello", return "holle". 
 * Given s = "leetcode", return "leotcede". 
 * soln:
 * - convert string to string array
 * - go thru string from start to end when u see vowel store it in temp and save its index position in start
 * * start looking for vowel from the end once u find store its index position in end andswap values 
 * 
 */
public class Reverse_Vowels_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String vowels = "AEIOUaeiou";
		char[] cArr= s.toLowerCase().toCharArray();


		if(s != null || s.length()!=0) {


			int start = 0;
			int end = s.length()-1;

			while(start<end){

				while(start<end && !vowels.contains(cArr[start]+"")){
					start++;
				}

				while(start<end && !vowels.contains(cArr[end]+"")){
					end--;
				}

				char temp = cArr[start];
				cArr[start] = cArr[end];
				cArr[end] = temp;

				start++;
				end--;
			}

		}//if

		System.out.println(String.valueOf(cArr));

	}

}
