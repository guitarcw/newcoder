package newcoder;

public class Solution_47 {
	public boolean match(char[] str, char[] pattern)
    {
        if(str==null||pattern==null) return false;
        return matchCore(str,pattern,0,0);
    }
	boolean matchCore(char[] str,char[] pattern,int s,int p) {
		if(s==str.length&&p==pattern.length) return true;
		if(s!=str.length&&p==pattern.length) return false;
		if(p<pattern.length-1&&pattern[p+1]=='*') {
			if((s!=str.length&&pattern[p]==str[s])||(pattern[p]=='.'&&s!=str.length))
				return matchCore(str,pattern,s+1,p+2)||matchCore(str,pattern,s+1,p)||matchCore(str,pattern,s,p+2);
			else return matchCore(str,pattern,s,p+2);
			
			
		}
		if((s!=str.length&&str[s]==pattern[p])||(pattern[p]=='.'&&s!=str.length))
			return matchCore(str,pattern,s+1,p+1);
		return false;
	}

}
