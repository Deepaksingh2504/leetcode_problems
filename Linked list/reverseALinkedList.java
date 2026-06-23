// REVERSE A LINKED LIST


class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev=null;
        ListNode current=head;
        ListNode future=head;

        while(current!=null)
        {
            future=current.next;
            current.next=prev;
            prev=current;
            current=future;
        }
        return prev;
    }
}
