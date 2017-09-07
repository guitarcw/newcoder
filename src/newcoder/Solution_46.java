package newcoder;

public class Solution_46 {
	public int[] multiply(int[] A) {
		int len=A.length;
		int[] out=new int[len];
		if(A==null||len<=0) return out;
		out[0]=1;
		if(len==1) return out;
		for(int i=1;i<len;i++) {
			out[i]=out[i-1]*A[i-1];
		}
		int temp=1;
		for(int i=len-2;i>0;i++) {
			temp*=A[i+1];
			out[i]*=temp;
		}
		return out;
		

    }

}
