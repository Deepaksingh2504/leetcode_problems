// REVERSE LINK LIST 2


class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

    ListNode dummyNode =new ListNode(-1);
    dummyNode.next=head;
        ListNode prevPart=dummyNode;
        for(int i=1;i<left;i++)
        {
            prevPart=prevPart.next;
        }
       

        ListNode nextPart=dummyNode;

        for(int i=1;i<=right;i++)
        {
                nextPart=nextPart.next;
        }

        ListNode prev=null;
        ListNode curr=prevPart.next;
        ListNode block=prevPart.next;

        for(int i=left;i<=right;i++)
        {
            ListNode future=curr.next;
            curr.next=prev;
            prev=curr;
            curr=future;
            
        }

        

        prevPart.next=prev;
        block.next=curr;



    return dummyNode.next;        
    }
}
