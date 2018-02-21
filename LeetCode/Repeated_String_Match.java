package GoogleChallenges;

/* 
 * A = "abcd" and B = "cdabcdab"
 * 
 * Returns :3
 * 
 * as repeat A thrice :  ab cdabcdab cd
 * 
 * 
 */


public class Repeated_String_Match {

	public static int RepeatedStringMatch(String A, String B) {
		String A_1 = A;

		if (A.length() <= 1 && A.length() > 10000 && B.length() <= 1 && B.length() > 10000 && A.length()>B.length())
			return -1;

		else {
			int l=1;
			while(!A.contains(B)) {
				l++;
				A = A.concat(A_1);

				if (A.length() > 10000)
					return -1;
			}
			return l;
		}
	}



	public static void main(String[] args) {

		String A = "abcd";
		String B = "cdabcdab";

		//		String A="baaabbbaba";
		//		String B="baaabbbababaaabbbababaaabbbababaaabbbababaaabbbababaaabbbababaaabbbababaaabbbababaaabbbababaaabbbaba";
		//		String A = "a";
		//		String B = "aa";
		//		String A = "bb";
		//		String B = "bbbbbbb";
		//		String A = "abcabcabcabc";
		//		String B ="abac";

		System.out.println(RepeatedStringMatch(A,B));

	}

}
