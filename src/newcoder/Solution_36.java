package newcoder;

import java.util.ArrayList;

import org.omg.CORBA.INTERNAL;
//С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
//���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
//û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,
//���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!

public class Solution_36 {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> out=new ArrayList<>();
		if(sum<=1) return out;
		int begin=1;
		int end=2;
		while(begin<(sum+1)/2) {
			int s=(begin+end)*(end-begin+1)/2;
			if(s==sum) {
				ArrayList<Integer> list=new ArrayList<>();
				for(int i=begin;i<=end;i++){
                    list.add(i);
                }
				out.add(list);
				begin++;end++;
			}
			else if(s<sum)
				end++;
			else begin++;
			
		}
		return out;
	       
    }

}
