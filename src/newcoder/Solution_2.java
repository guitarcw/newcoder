package newcoder;

public class Solution_2 {
public String replaceSpace(StringBuffer str) {
    	if (str==null){
    		return null;
    	}
    	StringBuffer output=new StringBuffer();
    	for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==' ') {
				output.append("%20");
			} else {
				output.append(str.charAt(i));

			}
			
		}
    	return output.toString();
    }

}
