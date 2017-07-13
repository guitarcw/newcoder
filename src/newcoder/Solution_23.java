package newcoder;

import java.util.ArrayList;

/*输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。  */
public class Solution_23 {
	   ArrayList<ArrayList<Integer>> out=new ArrayList<>();
	   ArrayList<Integer> nums=new ArrayList<>();
public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root==null)  return out;
        nums.add(root.val);
        target-=root.val;
        if(target==0&& root.left == null && root.right == null) out.add(new ArrayList<>(nums));
        FindPath(root.left, target);
        FindPath(root.right, target);
        nums.remove(nums.size()-1);
        return out;
    }

}
