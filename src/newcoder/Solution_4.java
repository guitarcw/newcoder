package newcoder;

import java.util.Arrays;

public class Solution_4 {
public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	TreeNode root = null;
	for (int i = 0; i < in.length; i++) {
		if (pre[0]==in[i]) {
			root=new TreeNode(pre[0]);
			root.left=this.reConstructBinaryTree(Arrays.copyOfRange(pre,1, i+1), Arrays.copyOfRange(in, 0, i));
			root.right=reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
		}
	}
	return root;
    }

}
 class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
