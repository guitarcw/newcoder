package newcoder;
//����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣���磬 5 / \ 3 7 /\ /\ 2 4 6 8 ��
//���������ֵ��С˳�����������ֵΪ4��

public class Solution_57 {
	TreeNode KthNode(TreeNode pRoot, int k)
    {
		if(pRoot==null) return null;
		int left=number(pRoot.left);
		int right=number(pRoot.right);
		if(k==left+1) return pRoot;
		if(k>left+1)
			return KthNode(pRoot.right, k-left-1);
		else 
			return KthNode(pRoot.left, k);
    
        
    }
	public int number(TreeNode p) {
		if(p==null) return 0;
		return 1+number(p.left)+number(p.right);
	}

}
