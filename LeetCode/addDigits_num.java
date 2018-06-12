package addDigits;

public class addDigits_num {

	public static int addDigits(int num) {

		int newnum=0;
		int temp;
		int count = 0;

		if (num < 0)
			return 0;
		else
		{
			while (num > 0) {
				temp = num % 10;
				num = num / 10;
				newnum = newnum + temp;
				count= count+1;
			}//while

			if (count == 1 || count ==0)
				return newnum;
			else
			{
				newnum=addDigits(newnum);
				return newnum;
			}//else
		}
	}//addDigits

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;

		int n = addDigits(num);
		System.out.println("number is:"+n);
	}

}
