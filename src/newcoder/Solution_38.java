package newcoder;

import java.util.Stack;

//�����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ���������������һ���������ַ�����S��
//�������ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc����
//�ǲ��Ǻܼ򵥣�OK���㶨����

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
