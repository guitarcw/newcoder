package newcoder;

public class Solution_25 {
	TreeNode left=null;
	TreeNode right=null;
public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        Convert(pRootOfTree.left);
        if(right==null){
        	left=right=pRootOfTree;
        }else{
        	right.right=pRootOfTree;
        	pRootOfTree.left=right;
        	right=pRootOfTree;
        }
        Convert(pRootOfTree.right);
        return left;
    }

}
