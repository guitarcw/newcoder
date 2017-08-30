package newcoder;

public class Solution_32 {
	public int GetNumberOfK(int [] array , int k) {
		int index=getIndexOfK(array,0,array.length-1, k);
		int m=index+1;
		int sum=0;
		if(index==-1) return sum;
		else {
			while(index>=0)
				if(array[index--]==k)
					sum++;
				else break;
		   while(m<=array.length-1)
			if(array[m++]==k)
				sum++;
			else break;
		}
		return sum;
	       
    }
	public int getIndexOfK(int [] array,int start,int end,int k) {
		int index=-1;
		int mid=(start+end)/2;
		if(start<=end) {
		
		if(array[mid]==k)
			return index=mid;
		else {
			if(array[mid]>k)
				getIndexOfK(array, start, mid-1,k);
			else
				getIndexOfK(array, mid+1, end,k);
		}
			}
		return index;
	}

}
