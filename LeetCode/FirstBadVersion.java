//anuja.nagare@uga.edu

package LeetCode_Easy;

/*
You are a product manager and currently leading a team to develop a new product. 
Unfortunately, the latest version of your product fails the quality check. 
Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which will return whether version is bad. 
Implement a function to find the first bad version. You should minimize the number of calls to the API.

// The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); 

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

    }
 */

public class FirstBadVersion extends VersionControl {

	static int firstBadVersion(int n) {

		int startV = 1, endV = n, midV;
		
		while (startV < endV) {
			midV = startV + (endV-startV) / 2; // 1 + (10-1) /2 = 1+9/2 = 1 + 4 = 5
											  // 1 + (5-1) /2 = 1+4/2 = 1 + 2 = 3
											  // 4 + (5-4) /2 = 1+1/2 = 4 + 0 = 4
			
			if (!isBadVersion(midV)) {
				startV = midV + 1;				
			}//if
			else {
				endV = midV;  
			}//else
		}//while
		
		return startV;
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int version = 10;
		System.out.println(firstBadVersion(version));
	}

}
