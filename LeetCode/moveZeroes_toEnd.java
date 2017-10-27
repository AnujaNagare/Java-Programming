//anuja.nagare@uga.edu

package LeetCode_Easy;

public class moveZeroes_toEnd {

	static int[] nums = {0, 1, 0, 3, 12};

	static int[] moveZeroes(int[] nums) {
		int temp;

		for(int j=0;j<nums.length-1;j++) {
			for(int i=0;i<nums.length-1;i++) {
				temp = nums[i+1];			
				if (nums[i] == 0) {
					nums[i+1] = 0;
					nums[i] = temp;	
					continue;
				}//if
			}//for
		}//for
		return nums;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nums = moveZeroes(nums);

		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " " );
		}//for



	}

}

