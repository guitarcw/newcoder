package newcoder;
//��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��
//case�ȹؼ��ּ������ж���䣨A?B:C����

public class Solution_42 {
public int Sum_Solution(int n) {
	int sum=n;
	boolean t=(sum!=0)&&((sum+=Sum_Solution(n-1))>0);
    return sum;
    }

}
