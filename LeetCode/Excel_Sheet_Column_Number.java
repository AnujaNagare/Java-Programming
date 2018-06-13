
public class Excel_Sheet_Column_Number {

	public static int titleToNumber(String s) {
		int ns=0;
		int l =s.length();

		for (int i=0;i<l; i++) {
			ns = ns + ((int)(s.charAt(l-i-1)) - (int)'A'+1)  * (int)(Math.pow(26, i)) ;
		}//for

		return ns;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAA";
		int ns = titleToNumber(s);
		System.out.println("number: " + ns );
	}

}
