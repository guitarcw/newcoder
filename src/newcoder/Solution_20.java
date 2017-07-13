package newcoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Solution_20 {
	public boolean IsPopOrder(int [] pushA,int [] popA) {
	      if (pushA.length==0||popA.length==0) {
			return false;
		}
	      Stack<Integer> assist=new Stack<>();
	      int popNumber=0;
	      for (int i = 0; i < pushA.length; i++) {
			assist.push(pushA[i]);
			while(!assist.empty()&&assist.peek()==popA[popNumber]){
				assist.pop();
				popNumber++;
			}
		}
	      return assist.empty();
    }

}
