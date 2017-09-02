package newcoder;

public class Solution_43 {
	 public int Add(int num1,int num2) {
		 while((num1&num2)!=0) {     
			  int n1=(num1^num2);
			  int n2=(num1&num2)<<1;
			  num1=n1;
			  num2=n2;
		   }
		   return num2|num1;
	        
	    }

}
