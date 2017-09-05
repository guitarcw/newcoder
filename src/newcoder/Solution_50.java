package newcoder;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Solution_50 {
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
		if(pHead==null) return null;
        ArrayList<ListNode> exm=new ArrayList<>();
        while(!exm.contains(pHead)) {
        	if(pHead==null) break;
        	exm.add(pHead);
        	pHead=pHead.next;
        }
        return pHead;
    }

}
