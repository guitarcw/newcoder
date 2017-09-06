package newcoder;

public class Solution_44 {
	public int StrToInt(String str) {
		char[] ch=str.toCharArray();
		int len=str.length();
        if(len==0) return 0;
		int start=0;int end=len-1;
		while(ch[start]==' ')
			start++;
		while(ch[end]==' ')
			end--;
		int sum=0;int index=1;
		if(ch[start]=='-') index=-1;
		for(int i=((ch[start]=='-'||ch[start]=='+')?++start:start);i<=end;i++) {
			if(!(ch[i]>='0'&&ch[i]<='9')) return 0;
			sum=sum*10+ch[i]-'0';
		}
		return sum*index;
	}

}
