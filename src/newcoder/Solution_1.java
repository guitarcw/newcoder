package newcoder;

public class Solution_1 {
	 public static boolean Find(int target, int [][] array) {
		 if (array==null) {
			return false;
		}
		 int column=array[0].length-1;
		 int row=0;
		 while (row<array.length&&column>=0) {
			if (array[row][column]==target) {
				return true;
			}
			else {
				if (target>array[row][column]) 
					row++;
				else
					column--;
			}
		}
		 return false;
		 //
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] k={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(Find(9, k)); 
		

	}
	 

}
