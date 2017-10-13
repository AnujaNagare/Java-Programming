//author : Anuja Nagare anuja.nagare@uga.edu

/* Task 
 * find factorial of a number 
 * */

public class Recursion_challenge {

//	recursion example: summation function
	public static int summation_Rec(int n) {
		int s=0;
		
//		base case
		if(n<=0) {
			s+=0;
		}//if
//		recursive case
		else {
			s =n + summation_Rec(n-1);
		}//else
		return s;
	}
	
//	recursion example: factorial function
	public static int factorial(int n) {
		int f=1;
//		base case
		if(n<=1) {
			f*=1;
		}//if
//		recursive case
		else {
			f = n * factorial(n-1);
		}//else
		return f;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(summation_Rec(5));
		System.out.println(factorial(4));
		
	}

}
