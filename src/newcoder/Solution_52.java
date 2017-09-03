package newcoder;

public class Solution_52 {
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		if(pNode==null) return null;
		if(pNode.right!=null) {
			pNode=pNode.right;
			while(pNode.left!=null) {
				pNode=pNode.left;
			}
			return pNode;
		}
		if(pNode.next!=null) {
			if(pNode.next.left==pNode)
				return pNode.next;
			pNode=pNode.next;
		}
        return null;
    }

}
