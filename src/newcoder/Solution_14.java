package newcoder;
/*����һ��������ת�����������������Ԫ�ء� */
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
