package newcoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution_29 {
	public int FirstNotRepeatingChar(String str) {
		Map<Character, Integer> map=new HashMap<>();
		for (Character ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				int value=map.get(ch);
				map.put(ch, value+1);
			}
			else map.put(ch, 1);
		}
		for(Character ch : str.toCharArray()) {
			int i=0;
			if(map.get(ch)==1)
				return i;
			i++;
		}
        return 0;
    }

}
