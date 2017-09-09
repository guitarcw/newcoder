package newcoder;

public class Solution_61 {
	public int movingCount(int threshold, int rows, int cols)
    {
        boolean[] visited=new boolean[rows*cols];
        if(rows<1||cols<1)return 0;
        int count=movingCountCore(threshold, rows, cols, 0, 0, visited);
        return count;
    }
	public int movingCountCore(int threshold,int rows,int cols,int row,int col,boolean[] visited) {
		int count=0;
		if(row>=0&&row<rows&&col>=0&&col<cols&&getDigitSum(row)+getDigitSum(col)<=threshold&&!visited[row*cols+col]) {
			visited[row*cols+col]=true;
			count=1+movingCountCore(threshold, rows, cols, row-1, col, visited)+movingCountCore(threshold, rows, cols, row, col-1, visited)
			+movingCountCore(threshold, rows, cols, row+1, col, visited)+movingCountCore(threshold, rows, cols, row, col+1, visited);
		}
		return count;
	}
	public int getDigitSum(int r) {
		if(0<=r&&r<=9)
			return r;
		return r%10+getDigitSum(r/10);
		
	}

}
