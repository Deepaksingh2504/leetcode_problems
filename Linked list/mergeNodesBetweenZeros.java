// MERGE NODES BETWEEN ZEROS


class Solution {
    public ListNode mergeNodes(ListNode head) {

        ListNode dummy=new ListNode(-1);
        ListNode trav=dummy;
        ListNode temp=head;

        while(temp!=null)
        {
            if(temp.val!=0)
            {
                int sum=0;
             
                while(temp.val!=0)
                {
                    sum+=temp.val;
                    temp=temp.next;
                }
                trav.next=new ListNode(sum);
                trav=trav.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}
