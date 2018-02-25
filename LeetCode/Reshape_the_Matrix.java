package Mathworks;

import java.util.*;


public class Reshape_the_Matrix {

	public static int[][] matrixReshape(int[][] nums, int r, int c) {

		int original_r = nums.length;
		int original_c = nums[0].length;

		if (original_r*original_c == r*c) {
			int[][] out = new int[r][c];

			ArrayList<Integer> a = new ArrayList<Integer>();


			for (int j=0;j<original_c;j++) {
				for (int i=0;i<original_r;i++) {
					a.add(nums[i][j]);
				}//for
			}//for

			int counter=0;

			for (int j=0;j<c;j++) {
				for (int i=0;i<r;i++) {
					out[i][j]=a.get(counter);
					counter++;
				}//for
			}//for
			return out;

		}//if
		else
			return nums;
	}//matrixReshape

	public static void print2DArray(int[][] out){
		for (int i=0;i<out.length;i++) {
			for (int j=0;j<out[0].length;j++) {
				System.out.print(out[i][j] + "\t");
			}//for
			System.out.println();
		}//for
	}//print2DArray


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		int[][] nums = {{1,2},{3,4}};
		//		int[][] nums = {{1,2,3},{4,5,6}};		
		int[][] nums = {{1,2},{3,4}, {5,6}};
		int r = 2, c = 3;

		print2DArray(nums);
		System.out.println();
		print2DArray(matrixReshape(nums, r, c));
	}//main

}//Reshape_the_Matrix class
