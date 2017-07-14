package newcoder;

public class Solution_26 {
	public int numberOf1Between1AndN_Solution(int n){
		if(n<1) return 0;
		int high,low,curr,tmp,i=1;
		high=n;
		int total=0;
		while(high!=0){
			high=n/(int)Math.pow(10, i);
			tmp=n%(int)Math.pow(10, i);
			curr=tmp/(int)Math.pow(10, i-1);
			low=tmp%(int)Math.pow(10, i-1);
			if(curr==1){
				total+=high*(int)Math.pow(10, i-1)+low+1;
			}else if(curr<1) total+=high*(int)Math.pow(10, i-1);
			else total+=(high+1)*(int)Math.pow(10, i-1);
			i++;
		}
		return total;
	}

}
