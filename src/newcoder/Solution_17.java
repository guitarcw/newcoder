package newcoder;
/*操作给定的二叉树，将其变换为源二叉树的镜像。*/
public class Solution_17 {
	
public void Mirror(TreeNode root) {
	TreeNode tmp=null;
	if(root!=null) {
		tmp=root.left;
		root.left=root.right;
		root.right=tmp;
		 if (root.left != null) Mirror(root.left); if (root.right != null) Mirror(root.right);
	}
        
    }

}
