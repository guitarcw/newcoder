package newcoder;

import java.util.ArrayList;
import java.util.LinkedList;

/*从上往下打印出二叉树的每个节点，同层节点从左至右打印。*/
public class Solution_21 {
public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> out=new ArrayList<>();
        LinkedList<TreeNode> tree=new LinkedList<>();
        if (root==null) {
			return out;
		}
        tree.add(root);
       for (int i = 0; i < tree.size(); i++) {
		TreeNode node=tree.get(i);
		out.add(node.val);
		if (node.left!=null) {
			tree.add(node.left);
		}
		if (node.right!=null) {
			tree.add(node.right);
		}
	}
       return out;
    }
}
