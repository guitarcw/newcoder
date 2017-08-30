package newcoder;

import java.util.ArrayList;

//输入一个递增排序的数组和一个数字S，在数组中查找两个数
//，是的他们的和正好是S，如果有多对数字的和等于S，输出
//两个数的乘积最小的。

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
