// REMOVE NTH NODE FROM END OF THE LIST 


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int len=0;
        ListNode temp=head;
        while(temp!=null )
        {
            len++;
            temp=temp.next;
        }

        int target=len-n;

        ListNode dummyNode =new ListNode(-1);
        ListNode traverse=dummyNode;
        dummyNode.next=head;

            while(target>0)
            {
                traverse=traverse.next;
                target--;
            }

            traverse.next=traverse.next.next;

        
        return dummyNode.next;
    }
}
