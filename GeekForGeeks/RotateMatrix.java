package GeekForGeeks;

import java.util.Scanner;

public class RotateMatrix {

	//rotate matrix by 180
	public static int[][] Rotate180(int[][] m ) {
		int[][] n = new int[m.length][m.length];
		//transpose 
		for (int i=0; i < m.length;i++) {
			for (int j=0; j<m.length; j++) {
				n[i][j] = m[j][i];
			}//for
		}//for

		//flip columns upside down
		for (int i=n.length-1; i >= 0 ;i--) {
			for (int j=n.length-1; j>=0; j--) {
				m[n.length-i-1][n.length-j-1] = n[i][j] ;
			}//for
		}//for

		//transpose 
		for (int i=0; i < m.length;i++) {
			for (int j=0; j<m.length; j++) {
				n[i][j] = m[j][i];
			}//for
		}//for

		return n;
	}//Rotate180

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();

		int[][] m= new int[r][c];
		int[][] n= new int[r][c];

		//		m = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		for (int i=0; i < m.length;i++) {
			for (int j=0; j<m.length; j++) {
				m[i][j] = sc.nextInt();
			}//for
		}//for

		n = Rotate180(m);

		//print output
		for (int i=0; i < n.length;i++) {
			for (int j=0; j<n.length; j++) {
				System.out.print(n[i][j] + " ");
			}//for
			System.out.println();
		}//for


	}//main
}//RotateMatrix
