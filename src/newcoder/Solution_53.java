package newcoder;
//请实现一个函数，用来判断一颗二叉树是不是对称的。注意，
//如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。

public class Solution_53 {
	boolean isSymmetrical(TreeNode pRoot)
    {
		if(pRoot==null) return true;
		return isSym(pRoot.left, pRoot.right);
    }
	boolean isSym(TreeNode pRoot1,TreeNode pRoot2) {
		if(pRoot1==null|pRoot2==null) {
			if(pRoot1==null&&pRoot2==null)
			return true;
			else return false;
		}
		if(pRoot1.val==pRoot2.val)
			return isSym(pRoot1.left,pRoot2.right)&&isSym(pRoot1.right,pRoot2.left);
		else return false;
	}
}
