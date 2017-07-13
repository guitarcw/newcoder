package newcoder;

import java.util.Stack;

public class Solution_19 {
	 public Stack<Integer> nums=new Stack<>();
	 private Stack<Integer> minNum=new Stack<>();
	
public void push(int node) {
        nums.push(node);
        if (minNum.isEmpty()||minNum.peek()<node) {
			minNum.push(node);
		} else {
			minNum.push(minNum.peek());

		}
    }
    
    public void pop() {
        nums.pop();
        minNum.pop();
    }
    
    public int top() {
        return nums.peek();
    }
    
    public int min() {
        return minNum.peek();
    }
    

}
