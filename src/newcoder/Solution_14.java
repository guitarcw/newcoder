package newcoder;
/*输入一个链表，反转链表后，输出链表的所有元素。 */
public class Solution_14 {
	public ListNode ReverseList(ListNode head) {
		ListNode list=null;
		ListNode next=null;
		while (head!=null) {
			next=head.next;
			head.next=list;
			list=head;
			head=next;
		}
		return list;
		

    }

}
