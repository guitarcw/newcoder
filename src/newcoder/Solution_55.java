package newcoder;

import java.util.ArrayList;

//从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
public class Solution_55 {
	ArrayList<ArrayList<Integer>> out =new ArrayList<>();
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		
		if(pRoot==null) return out;
		ArrayList<TreeNode> in=new ArrayList<>();
		in.add(pRoot);
		return get(in);
		
	    
    }
	public ArrayList<ArrayList<Integer> > get(ArrayList<TreeNode> list){
		
		if(list.isEmpty())return out;
		ArrayList<Integer> num=new ArrayList<>();
		ArrayList<TreeNode> k=new ArrayList<>();
		for (TreeNode node : list) {
			num.add(node.val);
			if(node.left!=null)
			k.add(node.left);
			if(node.right!=null)
			k.add(node.right);
		}
		out.add(num);
		return get(k);
	}

}
