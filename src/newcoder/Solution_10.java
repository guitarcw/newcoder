package newcoder;
/* ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��*/
public class Solution_10 {
	
	 public int NumberOf1(int n) {
		 int count=0;
		 while (n!=0) {
			count++;
			n=(n-1)&n;
		}
return count;
	    }

}
