/*The deletion distance of two strings is the minimum number of characters you need to delete in the two strings in order to get the same string. For instance, the deletion distance between "heat" and "hit" is 3:

    By deleting 'e' and 'a' in "heat", and 'i' in "hit", we get the string "ht" in both cases.
    We cannot get the same string from both strings by deleting 2 letters or fewer.

Given the strings str1 and str2, write an efficient function deletionDistance that returns the deletion distance between them. Explain how your function works, and analyze its time and space complexities.*/

package temp_Sample;
import java.io.*;
import java.util.*;
public class Deletion_Distance {
	static int deletionDistance(String str1, String str2) {
		// your code goes here
		String strAll = str1+str2;
		HashSet<Character> str1_ChH =new HashSet<Character>();
		HashSet<Character> str2_ChH =new HashSet<Character>();
		HashSet<Character> str_allH =new HashSet<Character>();
		int deletionDistance_V=0;
		

		for (char c: str1.toCharArray()){ //d o g
			if (!str2.contains(""+c)) { //
				str_allH.add(c);
				deletionDistance_V=deletionDistance_V+1;
			}//if
			str1_ChH.add(c);
		}//for

		for (char c: str2.toCharArray()){ 
			if (!str1.contains(""+c)) { //
				str_allH.add(c);
				deletionDistance_V=deletionDistance_V+1;
			}//if
			str2_ChH.add(c);
		}//for
				
		if ((str1_ChH.equals(str2_ChH)) &&  !str1.equals(str2)) {
			deletionDistance_V=str1_ChH.size();
		}//if
		
//		System.out.println(str_allH);
		return deletionDistance_V;
	}

	public static void main(String[] args) {

		String str1 = "dog", str2 = "frog";
		System.out.println(deletionDistance(str1, str2));
	}

}
