package newcoder;

public class Solution_33 {
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
