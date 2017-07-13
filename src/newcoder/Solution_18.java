package newcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下矩阵：
 *  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字
 *  1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.*/
public class Solution_18 {
	/*ArrayList<Integer> out=new ArrayList<>();
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		int rows=matrix.length;
		int column=matrix[0].length;
		int start=0;
		while (rows>start*2&&column>start*2) {
			 printMatrixInCircle(matrix, rows, column, start);
	            start++;
		}
	     return out;  
    }
	public void printMatrixInCircle(int [][] matrix, int row, int column, int start){
		for (int i = start; i < column-start; i++) {
			out.add(matrix[start][i]);
		}
		for (int i = start+1; i < row-start; i++) {
			out.add(matrix[i][column-start-1]);
		}
		for (int  i= column-start-2;i>=start&& row - start - 1 > start;i--) {
			out.add(matrix[row-start-1][i]);
		}
	

	    for(int n = row - start - 2; n >= start + 1 && column- start - 1 > start; n--)
			out.add(matrix[n][start]);
	}*/
	public ArrayList<Integer> printMatrix(int [][] matrix){
		ArrayList<Integer> out=new ArrayList<>();
		int row=matrix.length;
		int column=matrix[0].length;
		int layer=(Math.min(row, column)-1)/2+1;
		for (int i = 0; i <layer; i++) {
			for (int j = i; j < column-i; j++) {
				out.add(matrix[i][j]);
			}
			for (int j = i+1; j < row-i; j++) {
				out.add(matrix[j][column-i-1]);
			}
			for (int j = column-i-2; j >=i&&row-i-1>i; j--) {
				out.add(matrix[row-i-1][j]);
			}
			for (int j = row-i-2; j >= i+1&&column-i-1>i; j--) {
				out.add(matrix[j][i]);
			}
		}
		return out;
	}
}


