package newcoder;

import java.util.ArrayList;

//����һ����������������һ������S���������в���������
//���ǵ����ǵĺ�������S������ж�����ֵĺ͵���S�����
//�������ĳ˻���С�ġ�

public class Solution_37 {
public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	ArrayList<Integer> out=new ArrayList<>();
	int min=sum*sum;
	int start=0;
	int end=array.length-1;
	while(start<end) {
		 int all=array[start]+array[end];
		if(all==sum) {
			if(min>array[start]*array[end]) {
				min=array[start]*array[end];
				out.clear();
				out.add(array[start]);
				out.add(array[end]);
			}
			end--;
		}
		else
			if(all>sum)
				end--;
			else
				start++;
			
	}
        return out;
    }
}
