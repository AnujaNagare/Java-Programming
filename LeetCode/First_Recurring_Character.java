package GoogleChallenges;
import java.util.*;

/*
 * input: string
 * output : First_Recurring_Character
 * 
 * Mathod : create a hashmap and add each character from the string to it only when the character is new else break and return the repeated character  
 * 
 * complexity : O(n)
 */

public class First_Recurring_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="DBCABA";//"ABCA";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int i=0;
		
		for (char c:str.toCharArray()) {
			if (!map.containsKey(c))
				map.put(c,i);
			else {
				System.out.println(c);
				break;
			}
			i++;
		}
	}

}

