//anuja.nagare@uga.edu


public class Root_of_Number {

	// task : calculates the n’th root of a number
	// i/p : can be nonnegative number and positive integer "x"
	// o/p : positive n’th "root of x " ->within an error of 0.001


	static double root(double x, int n) {
		// your code goes here
		
		if (x==0) {
			return 0;
		}//if
		
		double start = 0, end = Math.max(1,x);
		double approxRoot = (start+end)/2;
		
		while ((approxRoot - start) >= 0.001) {
			if (Math.pow(approxRoot, n) > x) {
				end = approxRoot;
			}//if
			else if (Math.pow(approxRoot, n) < x) {
				start = approxRoot;
			}//if
			else{
				break;
			}//else
			approxRoot = (start+end)/2;
		}//while
		
		// root = Math.log10(x) / Math.log10(n);
		
		return (double) Math.round(approxRoot * 1000) / 1000;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=7, n=3 ; 
		//1.732

		System.out.println(root(x,n));
	}

}
