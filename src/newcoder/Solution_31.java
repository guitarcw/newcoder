package newcoder;

public class Solution_31 {
	 public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 int len1=0,len2=0;
		 ListNode node1=pHead1,node2=pHead2;
		 while(node1!=null) {
			 len1++;
			 node1=node1.next;
		 }
		 while(node2!=null) {
			 len2++;
			 node2=node2.next;
		 }
		 
		 if(len1>len2) {
			 for(int step=len1-len2;step>0;step--)
				 pHead1=pHead1.next;
		 }
		 else {
			 for(int step=len2-len1;step>0;step--)
				 pHead2=pHead2.next;
		 }
		 while(pHead1!=null){
		if(pHead1 == pHead2) return pHead1;
		pHead1 = pHead1.next;
	   pHead2 = pHead2.next;
	}
return null;
	    }
}
