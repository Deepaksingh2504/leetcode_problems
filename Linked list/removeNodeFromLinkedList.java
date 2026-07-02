// REMOVE NODE FROM LINKED LIST


class Solution {
    public ListNode removeNodes(ListNode head) {
        
        ListNode dummy=new ListNode(-1);
        ListNode traverse=dummy;

       
        
        ListNode trav=rev(head);
        int maxv=Integer.MIN_VALUE;

        while(trav!=null)
        {
           if(trav.val>=maxv)
           {
            maxv=trav.val;
            traverse.next=new ListNode(maxv);
            traverse=traverse.next;
            
           }
            trav=trav.next;
        }

        return rev(dummy.next);
    }

    static ListNode rev(ListNode h)
    {
         ListNode prev=null;
        ListNode current=h;
        ListNode future=h;

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
