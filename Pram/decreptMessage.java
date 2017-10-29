import java.util.*;

//input:  word = "dnotq"
//output: "crime"
//logic:
//Decrypted message: 	c 	r 	i 	m 	e
//	Step 1: 				99 	114 	105 	109 	101
//	Step 2: 				100 	214 	319 	428 	529
//	Step 3: 				100 	110 	111 	116 	113
//Encrypted message: 	d 	n 	o 	t 	q


public class decreptMessage {

	static String decrypt(String word) {

		int secondStep = 1;
		int newLetterAscii;
		StringBuilder sb = new StringBuilder();

		for (int i = 0 ; i<= word.length() - 1;i++) {
			newLetterAscii = (char)(word.charAt(i));
			newLetterAscii = newLetterAscii - secondStep;

			while (newLetterAscii < (char)('a')) {
				newLetterAscii = newLetterAscii+ 26;
			}//while

			sb.append((char)(newLetterAscii));
			secondStep = newLetterAscii + secondStep;
		}//for
		return sb.toString();
	}

	public static void main(String[] args) {
		String word = "dnotq";
		System.out.println(decrypt(word));	
	}
}