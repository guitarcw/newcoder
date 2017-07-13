package newcoder;
/*输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构） */
public class Solution_16 {
	public boolean isSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null) return true;
      if(root1==null) return false;
      if (root2.val==root1.val) {
			return isSubtree(root1.left, root2.left)&&isSubtree(root1.right, root2.right);
		}else return false;
  }
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null||root1==null) return false;
        return isSubtree(root1, root2)||HasSubtree(root1.left, root2)||HasSubtree(root1.right, root2);}

}
