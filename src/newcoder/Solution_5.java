package newcoder;

import java.util.Stack;

public class Solution_5 {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	stack1.push(node);
        
    }
    
    public int pop() {
    	Integer out=null;
    	while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
    	if (!stack2.isEmpty()) {
			out=stack2.pop();
			while (!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
		}
    	return out;
    	
    
    }

}
