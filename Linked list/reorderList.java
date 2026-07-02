// REORDER LIST 


class Solution {
    public void reorderList(ListNode head) {
        
        ListNode dummyNode =new ListNode (-1);
        dummyNode.next=head;


        ListNode slow=dummyNode;
        ListNode fast=dummyNode;
        int len=0;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            len++;
        }

        ListNode prev=null;
        ListNode current=slow.next;

        slow.next=null;

        while(current!=null)
        {
            ListNode future=current.next;
            current.next=prev;
            prev=current;
            current=future;
        }

        ListNode first=head;
        ListNode second=prev;

        while(second!=null)
        {
             ListNode firstNext=first.next;
          ListNode secondNext=second.next;

          first.next=second;
          second.next=firstNext;

          first=firstNext;
          second=secondNext;
        }

      
     
    }
}
