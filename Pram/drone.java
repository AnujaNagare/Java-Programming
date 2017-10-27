package drone;

import java.io.*;
import java.util.*;

/*
 * come up with an efficient algorithm that calculates the minimum amount of energy required for the company’s drone to complete its flight. 
 * You know that the drone burns 1 kWh (kilowatt-hour is an energy unit) for every mile it ascends, 
 * and it gains 1 kWh for every mile it descends. 
 * Flying sideways neither burns nor adds any energy.
 * Given an array route of 3D points, implement a function calcDroneMinEnergy that computes and returns the minimal amount of energy 
 * the drone would need to complete its route. 
 * Assume that the drone starts its flight at the first point in route. 
 * That is, no energy was expended to place the drone at the starting point.

input:  route = [ [0,   2, 10],
                  [3,   5,  0],
                  [9,  20,  6],
                  [10, 12, 15],
                  [10, 10,  8] ]

output: 5 # less than 5 kWh and the drone would crash before the finish
          # line. More than `5` kWh and it’d end up with excess energy


 */

class drone {

	static int calcDroneMinEnergy(int[][] route){

		int minEnergy =0;
		int currPos = route[0][2];
		int nextPos;
		int currEnergy = 0;

		for (int i=1; i<route.length;i++) {
			nextPos = route[i][2];

			if (currPos > nextPos) {
				//descent : gain
				currEnergy = currEnergy + (currPos - nextPos);
			}//if
			else {
				//ascend : loss
				currEnergy = currEnergy + (currPos - nextPos);
				minEnergy = Math.min(minEnergy, currEnergy);
			}//else

			currPos = nextPos;
		}//for		

		if (minEnergy < 0) {
			return -minEnergy;
		}//if
		else {
			return minEnergy;
		}//else
	}//calcDroneMinEnergy

	public static void main(String[] args) {
		int[][] route = {{0,2,10},{3,5,0},{9,20,6},{10,12,15},{10,10,8}};
		System.out.println(calcDroneMinEnergy(route));
	}//main

}
