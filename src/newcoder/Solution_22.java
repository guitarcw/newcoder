package newcoder;

import java.util.Arrays;

/*输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。 */
public class Solution_22 {
public boolean VerifySquenceOfBST(int [] sequence) {
//        if(sequence.length==1) return true;
//        int i=0;
//        while(sequence[i]>=sequence[sequence.length-1]){
//        	i++;
//        }
//        for (int j = i; j < sequence.length-1; j++) {
//			if(sequence[j]<sequence[sequence.length-1]) return false;
//		}
//        if(i==0||i==sequence.length-1) return VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, sequence.length-2));
//        return VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i-1))&&VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length-2));
//	int size = sequence.length;
//    if(0==size)return false;
//
//    int i = 0;
//    while(size==0)
//    {
//    	--size;
//        while(sequence[i++]<sequence[size]);
//        while(sequence[i++]>sequence[size]);
//
//        if(i<size)return false;
//        i=0;
//    }
//    return true;
//    	
	

		if(sequence.length==0)
	return false;
		if(sequence.length==1)
		return true;
	return BST(sequence, 0, sequence.length-1);
        	
        }
public boolean BST(int[] a,int start,int end){
	if(start>=end) return true;
	int i=end;
	while(i>start&&a[i-1]>a[end])
		i--;
	for(int j=start;j<i-1;j++)
		if(a[j]>a[end])
			return false;
		return BST(a,start,i-1)&&BST(a,i,end-1);
}

    }


