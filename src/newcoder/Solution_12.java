package newcoder;
/*����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿��
 * �����е�ż��λ��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣*/
public class Solution_12 {
public void reOrderArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
        	for (int j = array.length-1; j > i; j--) {
				if(array[j]%2==1&&array[j-1]%2==0){
					int tmp=array[j];
					array[j]=array[j-1];
					array[j-1]=tmp;
				}
			}
        	
			}
		}
    }

