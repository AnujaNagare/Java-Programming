//Anuja Nagare: anuja.nagare@uga.edu

package poyInterface;
/*
 * The AdvancedArithmetic interface and the method declaration for the abstract int divisorSum(int n) method are provided for you in the editor below. 
 * Write the Calculator class, which implements the AdvancedArithmetic interface. 
 * The implementation for the divisorSum method must be public and take an integer parameter,n, and return the sum of all its divisors.
 */


import java.util.Scanner;

public class AdvancedArithmetic_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic_interface myCalculator = new Calculator(); 
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
		System.out.println(sum);
	}

}

class Calculator implements AdvancedArithmetic_interface{
	public int divisorSum(int n) {
		int sum=0;
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				sum = sum + i;
			}
		}

		return sum;
	};

}