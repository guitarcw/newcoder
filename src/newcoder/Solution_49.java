package newcoder;

public class Solution_49 {
	public int[] loc=new int[256];
	public int index;
	public Solution_49() {
		for(int i=0;i<256;i++) {
			loc[i]=-1;
		}
		index=0;
	}
	public void Insert(char ch)
    {
        if(loc[ch]==-1)
        	loc[ch]=index;
        else if(loc[ch]>=0)
        	loc[ch]=-2;
        index++;
    }
    public char FirstAppearingOnce()
    {   char ch='\0';
    int min=index+1;
    	for(int i=0;i<256;i++) {
    		if(loc[i]>=0&&loc[i]<min){
    			ch=(char)i;
    			min=loc[i];
    		}
    	}
    return ch;
    }

}
