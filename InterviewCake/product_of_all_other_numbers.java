/*
 * @anuja.nagare@uga.edu
 * 
 * given: array of integers
 * 
 * output: for each index you want to find the product of every integer except the integer at that index.
 * 
 */

public class product_of_all_other_numbers {

	//Method1 with O(n) time complexity
	public static int[] getProductsOfAllIntsExceptAtIndex1(int[] X) {
		int[] out1 = new int[X.length];
		int[] out2 = new int[X.length];
		int[] out = new int[X.length];

		for (int i=0;i<X.length;i++) {
			out1[i]=1;
			out2[i]=1;
		}//for

		for (int i=1; i<X.length; i++) {
			out1[i] = out1[i]*out1[i-1]*X[i-1];
		}//for

		for (int i=X.length-2; i>=0; i--) {
			out2[i] = out2[i]*out2[i+1]*X[i+1];
		}//for

		for (int i=0; i<X.length; i++) {			
			out[i]=out1[i]*out2[i];
		}//for

		return out;
	}

	//	Method0 with O(n^2) time complexity
	public static int[] getProductsOfAllIntsExceptAtIndex0(int[] X) {

		int[] out = new int[X.length];
		for (int i=0;i<X.length;i++) {
			out[i]=1;
		}//for

		for (int i=0; i<X.length; i++) {
			for (int j=0; j<X.length;j++) {
				if(i!=j) {
					out[i] = out[i]*X[j];				
				}//if
			}//for
		}//for

		return out;
	}

	public static void printOutput(int[] out) {
		for (int i=0;i<out.length;i++) {
			System.out.print(out[i]+"\t");
		}//for
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int[] x = {1, 7, 3, 4};
		int[] x = {3, 1, 2, 5, 6, 4};

		printOutput(getProductsOfAllIntsExceptAtIndex0(x));
		System.out.println();
		printOutput(getProductsOfAllIntsExceptAtIndex1(x));

	}

}
