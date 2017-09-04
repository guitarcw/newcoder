package newcoder;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution_54 {
		public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
			ArrayList<ArrayList<Integer>> out =new ArrayList<>();
					if(pRoot==null) return out;
			        ArrayList<Integer> n=new ArrayList<>();
					n.add(pRoot.val);
					out.add(n);
					LinkedList<TreeNode> preList=new LinkedList<>();
					preList.add(pRoot);
					int index=1;
					while(true) {
						ArrayList<Integer> num=new ArrayList<>();
						LinkedList<TreeNode> tmp=new LinkedList<>();
						if(index++%2==1) {
							
							while(!preList.isEmpty()) {
								TreeNode k=preList.pop();
								   if(k.right!=null)
								{tmp.push(k.right);num.add(k.right.val);}
								if(k.left!=null)
									{num.add(k.left.val);
									tmp.push(k.left);
									}
							}
						}
						else {
							while(!preList.isEmpty()) {
								TreeNode k=preList.pop();
								   if(k.left!=null)
								{tmp.push(k.left);num.add(k.left.val);}
								if(k.right!=null)
									{tmp.push(k.right);num.add(k.right.val);}
							}
							
						}
						preList=tmp;
						if(!num.isEmpty())
							out.add(num);
						else
							break;
					}
					return out;
			    }

}
