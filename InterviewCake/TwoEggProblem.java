
public class TwoEggProblem {

	public static int TwoEggProblem(int f, int hn) {
		int s = 0, e = 0;
		int i;

		for (i=10; i>hn; i=i+10) {
			if (i < hn) {
				s = i;
				e = i+10;
			}//if
			else if (i>hn){
				e = i;
				s = i-10;
			}//if
			else if(i==hn){
				return i;
			}//if
		}// 
		
		return firsteggbroke(e, s, hn);
	}

	public static int firsteggbroke(int s, int e, int hn) {
		int i;
		for (i=s; i>=e; i++) {
			if (i == hn) {
				return i;
			}//if
		}// for check till 2nd egg breaks
	
		return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int floors = 100, hf = 13;
		System.out.println(TwoEggProblem(floors, hf));

	}

}


// Test Cases
//Highest floor an egg won't break from
//13
//
//Floors we drop first egg from
//14
//
//Floors we drop second egg from
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
//
//Total number of drops
//14
//
//Highest floor an egg won't break from
//98
//
//Floors we drop first egg from
//14, 27, 39, 50, 60, 69, 77, 84, 90, 95, 99
//
//Floors we drop second egg from
//96, 97, 98
//
//Total number of drops
//14

