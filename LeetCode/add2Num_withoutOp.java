// @author Anuja Nagare - anuja.nagare@uga.edu

public class add2Num_withoutOp {
	
	public static int getSum(int a, int b) {
        if (b == 0)
            return a;
        else
//   ^ is a bitwise XOR operator
//   & is a bitwise and operator 
//   << is a bitwise left shift operator
            return getSum( a ^ b, (a & b) << 1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(15,32));
	}

}
