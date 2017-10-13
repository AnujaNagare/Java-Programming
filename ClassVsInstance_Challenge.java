//author : Anuja Nagare anuja.nagare@uga.edu

import java.io.*;
import java.util.*;

public class ClassVsInstance_Challenge {

	 private int age;	
	  
		public ClassVsInstance_Challenge(int initialAge) {
			if (initialAge > 0) {
		  		age = initialAge;
			}
			else {
				age = 0;
				System.out.println("Age is not valid, setting age to 0");
			}
		}

// Performs the following conditional actions:
//		    If age < 13 , print You are young..
//		    If age > 13 and age < 18 , print You are a teenager..
////		    Otherwise, print You are old..
		public void amIOld() {
	  		// Write code determining if this person's age is old and print the correct statement:
			if(age < 13) {
		        System.out.println("You are young");				
			}
			else if (age > 13 && age < 18) {
				System.out.println("You are a teenager");				
			}
			else {
				System.out.println("You are old");		
			}
		}

//		Increases the age instance variable by 1. 
		public void yearPasses() {
	  		// Increment this person's age.
			age = age + 1;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				int age = sc.nextInt();
				ClassVsInstance_Challenge p = new ClassVsInstance_Challenge(age);
				p.amIOld();
				for (int j = 0; j < 3; j++) {
					p.yearPasses();
				}
				p.amIOld();
				System.out.println();
	        }
			sc.close();
	    }

}
