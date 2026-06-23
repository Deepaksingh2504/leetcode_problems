// INTERSECTION OF TWO LINKED LIST



public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode fast=headB;
        ListNode slow=headA;

        while(fast!=slow )
        {
            fast=(fast==null)?headA:fast.next;
            slow=(slow==null)?headB:slow.next;
        }
        return fast;

    }
}
