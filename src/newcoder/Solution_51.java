package newcoder;

public class Solution_51 {
	public ListNode deleteDuplication(ListNode pHead)
	
    {
	     if(pHead==null) return pHead;
	        if(pHead!=null&&pHead.next==null) return pHead;
			while(pHead.next!=null&&pHead.next.val==pHead.val) {
				pHead=pHead.next;
	            if(pHead.next==null) return null;
				if(pHead.next.val!=pHead.val)
					pHead=pHead.next;
			}
	        

			pHead.next=deleteDuplication(pHead.next);
			return pHead;

    }

}
