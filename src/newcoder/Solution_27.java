package newcoder;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_27 {
	public String PrintMinNumber(int[] numbers){
		if(numbers==null||numbers.length==0) return "";
		int len=numbers.length;
		String[] str=new String[len];
		String out="";
		for (int i = 0; i < len; i++) {
			str[i]=String.valueOf(numbers[i]);
		}
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String c1=o1+o2;
				String c2=o2+o1;
				return c1.compareTo(c2);
			}
			
		});
		for (int i = 0; i < str.length; i++) {
			out=out+str[i];
		}
		return out;
	}

}
