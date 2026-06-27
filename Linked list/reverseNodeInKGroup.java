// REVERSE NODES IN K GROUP
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode dummyNode =new ListNode(-1);
        dummyNode.next=head;

        if(head==null || k==0)
        {
            return dummyNode.next;
        }
        ListNode first=head;
       
        ListNode current=head;
        ListNode future=head;
        ListNode prevGrp=dummyNode;
        ListNode checkKth=dummyNode;
        while(true)
        {
             checkKth=prevGrp;
            for(int i=0;i<k;i++)
            {
                checkKth=checkKth.next;

                if(checkKth==null)
                {
                    return dummyNode.next;
                }
            }

            first=current;
             ListNode prev=null;
            for(int i=0;i<k;i++)
            {
                future=current.next;
                current.next=prev;
                prev=current;
                current=future;
            }

            prevGrp.next=prev;
            first.next=current;
            prevGrp=first;
           
            

        }
       
    }
}
