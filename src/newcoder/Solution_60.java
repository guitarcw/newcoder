package newcoder;

public class Solution_60 {
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
		if(matrix==null||rows<1||cols<1||str==null)
			return false;
		boolean[] visited=new boolean[rows*cols];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				if(isRight(matrix, rows, cols, row, col, 0, str, visited))
					return true;
			}
			
		}
		return false;
		
    }
	public boolean isRight(char[] m,int rows,int cols,int row,int col,int len,char[] str,boolean[] visited) {
		if(len==str.length) return true;
		boolean ifRight=false;
		if(row>=0&&row<rows&&col>=0&&col<cols&&m[row*cols+col]==str[len]&&!visited[row*cols+col]) {
			len++;
			visited[row*cols+col]=true;
			ifRight=isRight(m, rows, cols, row, col-1, len, str, visited)
					||isRight(m, rows, cols, row, col+1, len, str, visited)
					||isRight(m, rows, cols, row-1, col, len, str, visited)
					||isRight(m, rows, cols, row+1, col, len, str, visited);
			if(!ifRight) {
				len--;
				visited[row*cols+col]=false;
			}
		}
		return ifRight;
	}

}
