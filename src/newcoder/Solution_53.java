package newcoder;
//��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�ע�⣬
//���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�

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
