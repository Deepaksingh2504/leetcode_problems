//REMOVE DUPLICATE FROM THE SORTED LIST 2



class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummyNode =new ListNode(-1);
        dummyNode.next=head;

        ListNode prev=dummyNode;
        ListNode curr=head;

        while(curr!=null)
        {

            if(curr.next!=null && curr.val==curr.next.val)
            {
                int val=curr.val;

                while(curr!=null && curr.val==val)
                {
                    curr=curr.next;
                }
                prev.next=curr;
            }
            else
            {
                prev=curr;
                curr=curr.next;
            }
        }
    return dummyNode.next;
    }
}
