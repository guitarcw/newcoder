package newcoder;

public class Solution_34 {
	public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null) return true;
        else { 
        	if(Math.abs(TreeDepth(root.left)-TreeDepth(root.right))<=1) {
        		return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
        	}
        	else 
        		return false;
        }
    }
    public int TreeDepth(TreeNode root) {
	int depth=0;
	if(root==null) return depth;
	else {
		int leftDepth=1+TreeDepth(root.left);
		int rightDepth=1+TreeDepth(root.right);
		return Math.max(leftDepth, rightDepth);
	}        
    }
}
