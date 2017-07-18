package newcoder;

import java.util.ArrayList;
import java.util.List;

public class Solution_28 {
	public int GenUglyNumber_Solution(int index){
		if(index<=0) return 0;
		if(index==1) return 1;
		int num1=0;int num2=0;int num3=0;
		int[] out=new int[index];
		out[0]=1;
		for (int i = 0; i < out.length; i++) {
			out[i]=Math.min(out[num1]*2,Math.min(out[num2]*3, out[num3]*5));
			if(out[i]==out[num1]*2) num1++;
			if(out[i]==out[num2]*3) num2++;
			if(out[i]==out[num3]*5) num3++;
		}
		return out[index-1];
		
	}

}
