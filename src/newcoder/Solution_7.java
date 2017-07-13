package newcoder;

public class Solution_7 {
	public int Fibonacci(int n) {
		int a1=0,a2=1,sum=1;
		int i=0;
		if (n==0) {
			return 0;
		}
		while (i<n) {
			sum=a1+a2;
			a1=a2;
			a2=sum;
			i++;
		}
return sum;
    }

}
