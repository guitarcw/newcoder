package newcoder;
//ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
//ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼�����磬
//��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
//��ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��

public class Solution_39 {
public String ReverseSentence(String str) {
	if(str.trim().equals("")) return str;
	String[] in=str.split(" ");
	StringBuffer out=new StringBuffer();
	for(int i=in.length;i>0;i--) {
		out.append(in[i-1]);
		if(i>1)
			out.append(" ");
	}
	
     return out.toString();   
    }

}
