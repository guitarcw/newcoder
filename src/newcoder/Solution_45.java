package newcoder;
//��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�
//����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ�������
//�� ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2��

public class Solution_45 {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
		if(numbers==null||length<=0) return false;
		for(int i=0;i<length;i++) {
			if(numbers[i]<0||numbers[i]>length-1)
				return false;
		}
		for(int i=0;i<length;i++) {
			while(numbers[i]!=i) {//�ж��±�����±������ֵ�Ƿ���ͬ�����������
				if(numbers[i]==numbers[numbers[i]])
					{duplication[0]=numbers[i];
					return true;
					}
				int tmp=numbers[i];//����λ�ã�ʹ���±���ֵ��ͬ
				numbers[i]=numbers[numbers[i]];
				numbers[tmp]=tmp;
			}
		}
		return false;
	    
    }
	

}
