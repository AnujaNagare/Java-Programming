//Anuja Nagare: anuja.nagare@uga.edu

package Inheritance_Challenge;

/*
 * You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

    A Student class constructor, which has parameters:
       String firstName, 
       String lastName, 
       int identification,
        An integer array (or vector) of test scores, .
    A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:

 */
import java.util.Scanner;

public class Student extends Person{
	String firstName;
	String lastName;
	int identification;
	public int[] scores;

	/*	
	 *   Class Constructor
	 *   
	 *   @param firstName - A string denoting the Person's first name.
	 *   @param lastName - A string denoting the Person's last name.
	 *   @param id - An integer denoting the Person's ID number.
	 *   @param scores - An array of integers denoting the Person's test scores.
	 */
	// Write your constructor here
	Student(String firstName, String lastName, int identification, int[] scores) {
		super(firstName, lastName, identification);
		this.scores = scores;
		// TODO Auto-generated constructor stub
	}

	/*	
	 *   Method Name: calculate
	 *   @return A character denoting the grade.
	 */
	// Write your method here

	public String calculate() {
		
		int sum=0;;
		for (int i=0;i<scores.length;i++) {
			sum = sum + scores[i];
		}
		
		int a =  sum/(scores.length);
		String grade = "";
		
//		System.out.println(sum);
		
		if ( a <=100 && a >= 90) {
			grade = "O";
		}
		else if ( a <90 && a >= 80) {
			grade = "E";
		}
		else if ( a <80 && a >= 70) {
			grade = "A";
		}
		else if ( a <70 && a >= 55) {
			grade = "P";
		}
		else if ( a <55 && a >= 40) {
			grade = "D";
		}
		else if ( a < 40) {
			grade = "T";
		}
		return grade;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		
		System.out.println("Grade: " + s.calculate() );
	}
}

