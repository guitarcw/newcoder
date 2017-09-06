package newcoder;
//在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
//但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字
//。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。

public class Solution_45 {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
		if(numbers==null||length<=0) return false;
		for(int i=0;i<length;i++) {
			if(numbers[i]<0||numbers[i]>length-1)
				return false;
		}
		for(int i=0;i<length;i++) {
			while(numbers[i]!=i) {//判断下标与此下标的数的值是否相同，相等则跳过
				if(numbers[i]==numbers[numbers[i]])
					{duplication[0]=numbers[i];
					return true;
					}
				int tmp=numbers[i];//交换位置，使得下标与值相同
				numbers[i]=numbers[numbers[i]];
				numbers[tmp]=tmp;
			}
		}
		return false;
	    
    }
	

}
