package GoogleChallenges;
/*
 * @anuja.nagare@uga.edu
 * Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
*/
import java.util.*;

public class Find_All_Num_Disappeared_in_Array {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
//            System.out.println(val);
            if(nums[val] > 0) {
                nums[val] = -nums[val];
//                System.out.println(nums[val]);
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {4,3,2,7,8,2,3,1}; 
		List<Integer> res = new ArrayList<Integer>() ;
		HashSet hs = new HashSet();
		
		for (int i=0; i<a.length ; i++) {
			hs.add(a[i])	;
		}//for
				
		for (int i=1; i<=a.length ; i++) {
			if (!hs.contains(i)) {
				res.add(i);
			}//if
		}//for

//		System.out.println(hs);
		System.out.println(res);
		
		System.out.println(findDisappearedNumbers(a));
		
	}

}
