package GoogleChallenges;


/*
 * @anuja.nagare@uga.edu
 * 
 * Given: a number from 1 to n
 * 		  Every time you guess wrong, I'll tell you whether the number is higher or lower.
 * o/p: guess which number I picked.
 * 
 * soln: binary search
 * 
 */

import java.util.*;


public class Guess_Number_Higher_or_Lower {
	public static int givenNum;
	public static int n=10;	

	public static int guess(int num) {

		//		-1 : My number is lower
		if (givenNum < num)
			return -1;
		//		 1 : My number is higher
		else if (givenNum > num)
			return 1;
		//		0 : Congrats! You got it!
		else
			return 0;
	}//guess

	public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        
        while (start <= end) {
            int myGuess = start + (end - start) / 2;
            int res = guess(myGuess);
            if (res == 0)
                return myGuess;
            else if (res < 0)
                end = myGuess - 1;
            else
                start = myGuess + 1;
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number greater than 1 and less than "+n);
		givenNum = sc.nextInt();
//		guessNumber(givenNum);

		System.out.println(guessNumber(givenNum));
	}

}
