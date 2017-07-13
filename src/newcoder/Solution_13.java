package newcoder;
/*输入一个链表，输出该链表中倒数第k个结点*/
public class Solution_13 {
	public ListNode FindKthToTail(ListNode head,int k) {
		int length=0;
		ListNode node=head;
		while(node!=null){
			length++;
			node=node.next;
		}
		if(k>length){
			return null;
		}
		for (int i = 0; i <length-k; i++) {
			head=head.next;
		}
		return head;

    }

}
