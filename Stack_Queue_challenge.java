//Anuja Nagare: anuja.nagare@uga.edu

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Stack_Queue_challenge {

	//  Two instance variables: one for your stack , and one for your queue.
	Stack stack;
	LinkedList queue;

	public Stack_Queue_challenge (){
		stack = new Stack();
		queue = new LinkedList();
	}

	//	  A void pushCharacter(char ch) method that pushes a character onto a stack.	
	private void pushCharacter(char c) {
		// TODO Auto-generated method stub
		stack.push(c);
	}

	//  A void enqueueCharacter(char ch) method that enqueues a character in the instance variable.
	private void enqueueCharacter(char c) {
		// TODO Auto-generated method stub
		queue.addLast(c);
	}

	//  A char dequeueCharacter() method that dequeues and returns the first character in the instance variable.
	private Object dequeueCharacter() {
		// TODO Auto-generated method stub
		return queue.remove(0);
	}

	//  A char popCharacter() method that pops and returns the character at the top of the instance variable.
	private Object popCharacter() {
		// TODO Auto-generated method stub
		return stack.pop();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	        scan.close();

	        // Convert input String to an array of characters:
	        char[] s = input.toCharArray();

	        // Create a Solution object:
	        Stack_Queue_challenge p = new Stack_Queue_challenge();

	        // Enqueue/Push all chars to their respective data structures:
	        for (char c : s) {
	            p.pushCharacter(c);
	            p.enqueueCharacter(c);
	        }

	        // Pop/Dequeue the chars at the head of both data structures and compare them:
	        boolean isPalindrome = true;
	        for (int i = 0; i < s.length/2; i++) {
	            if (p.popCharacter() != p.dequeueCharacter()) {
	                isPalindrome = false;                
	                break;
	            }
	        }

	        //Finally, print whether string s is palindrome or not.
	        System.out.println( "The word, " + input + ", is " 
	                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	        
	       

	}

}
