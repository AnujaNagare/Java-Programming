package medium_challenge;

import java.util.ArrayList;
import java.util.HashSet;

public class Valid_Sudoku {

	public static boolean isValidSudoku(char[][] board) {
		boolean b=true;
		HashSet<Character> h = new HashSet<Character>();
		//		char[][] ;
		ArrayList<Character> tempC = new ArrayList<Character>();

		// Each row must contain the digits 1-9 without repetition. 
		for(char[] i: board) {
			for(char j:i) {
				if(!h.contains(j) && j!='.') {
					h.add(j);
				}//if
				else if(h.contains(j) && j!='.')  {
					b =false;
				}//if
				if (j!='.'  && (j < '1' || j > '9'))  {
					b =false;
				}
			}//for
			h = new HashSet<Character>();
		}//for

		h = new HashSet<Character>();
		//		Each column must contain the digits 1-9 without repetition.
		for (int k=0;k <board.length;k++) {
			tempC = new ArrayList<Character>();
			for (int i=0;i < board.length; i++) {
				tempC.add(board[i][k]);
			}//for
			for(char j:tempC) {
				if(!h.contains(j) && j!='.') {
					h.add(j);
				}//if
				else if(h.contains(j) && j!='.')  {
					b =false;
				}//if
				if (j!='.'  && (j < '1' || j > '9'))  {
					b =false;
				}
			}//for
			h = new HashSet<Character>();
		}//for

		//Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
		ArrayList<Character> tempCR = new ArrayList<Character>();
		h = new HashSet<Character>();

		for (int k=0;k < board.length; k=k+3) {
			for (int i=0;i < board.length; i=i+3) {
				tempCR = new ArrayList<Character>();
				tempCR.add(board[i][k+0]);
				tempCR.add(board[i][k+1]);
				tempCR.add(board[i][k+2]);

				tempCR.add(board[i+1][k+0]);
				tempCR.add(board[i+1][k+1]);
				tempCR.add(board[i+1][k+2]);

				tempCR.add(board[i+2][k+0]);
				tempCR.add(board[i+2][k+1]);
				tempCR.add(board[i+2][k+2]);
				//					System.out.println(tempCR);

				for(char j:tempCR) {
					if(!h.contains(j) && j!='.') {
						h.add(j);
					}//if
					else if(h.contains(j) && j!='.')  {
						b =false;
					}//if
					if (j!='.'  && (j < '1' || j > '9'))  {
						b =false;
					}
				}//for
				h = new HashSet<Character>();
			}//for
		}//for


		return b;
	}//isValidSudoku

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board1 = {{'5','3','.','.','7','.','.','.','.'}, {'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'}, {'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'}, {'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'}, {'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}};

		char[][] board2 = {  {'5','3','.','.','7','.','.','.','.'}, 
				{'6','.','3','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'}, 
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'}, 
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'}, 
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}};


		boolean b1 = isValidSudoku(board1);
		System.out.println(b1);

		boolean b2 = isValidSudoku(board2);
		System.out.println(b2);


	}//main

}//Valid_Sudoku
