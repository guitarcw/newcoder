package newcoder;

import java.util.Stack;

//汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，
//请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
//是不是很简单？OK，搞定它！

public class Solution_38 {
	  public String LeftRotateString(String str,int n) {
		  int k=0;
		  n=n%str.length();
		  char[] out=new char[str.length()];
		  char[] in=str.toCharArray();
		  for(int i=0;i<str.length()-n;i++)
			  out[i]=in[i+n];
		  for(int i=str.length()-n;i<str.length();i++)
			  out[i]=in[k++];
		  return new String(out);
	        
	    }
	  public static void mian() {
		  
	  }
}
