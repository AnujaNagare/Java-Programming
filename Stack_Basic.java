//author : Anuja Nagare anuja.nagare@uga.edu

import java.util.LinkedList;
import java.util.Stack;

public class Stack_Basic {
LinkedList stack;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stacky = new Stack();
		stacky.push("there");
		stacky.push("Hi");
		
		System.out.println(stacky);
		System.out.println(stacky.pop());
		System.out.println("Peek "+stacky.peek());
		System.out.println(stacky.pop());
		System.out.println(stacky.size());
		
		 

	}
}
