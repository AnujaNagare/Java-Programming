import java.util.HashMap;

/*
 * @anuja.nagare@uga.edu
 * Problem: You want to build a word cloud, an infographic where the size of a word corresponds to how often it appears in the body of text. 
 *
 * input: long string 
 * output:  hash map : keys = words ; values = number of times the words occurred
 * 
 * soln://read string, make it lowercase and remove spaces and punctuation and add to a list 
		//create a hashmap from this list with word as key and value as 1(if it is new)
		//else increment its value by one 
 * 
 * complexity: O(n)
 */

public class word_cloud_data_generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "After beating the eggs, Dana read the next step Add milk and eggs, then add flour and sugar.";
		//		String str = "hi, Anuja Nagare, hi";

		//		String str="We came, we saw, we conquered...then we ate Bill's (Mille-Feuille) cake.";
		//		String str="The bill came to five dollars.";
		//		String str = "I'm singing ♬ on a ☔ day.";

		HashMap<String, Integer> map1 = new HashMap<String, Integer>();

		String[] str_A = str.split(" ");

		//		System.out.println(str);
		//		String[] words = str.split("\\s+");
		//		String[] words = str.replaceAll("[^a-zA-Z ]", "").split("\\s+");
		String[] words = str.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

		for (String s:words) {
			if (!map1.containsKey(s)) {
				map1.put(s, 1);
			}//if
			else {
				map1.put(s, map1.get(s)+1);
			}
		}//for

		System.out.println(map1);
	}//main

}//word_cloud_data_generator