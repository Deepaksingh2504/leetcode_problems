// swap nodes in pair


class Solution {
    public ListNode swapPairs(ListNode head) {

        ListNode dummyNode=new ListNode(-1);
        dummyNode.next=head;

        ListNode prev=dummyNode;

        while(prev.next!=null && prev.next.next!=null)
        {
            ListNode first=prev.next;
            ListNode second=first.next;
            ListNode nextPair=second.next;

            second.next=first; //2->1
            prev.next=second;//dummy->2
            first.next=nextPair;//1->nextPair
           // dummy ->2->1->nextPair
           prev=first;

        }

        return dummyNode.next;
    }
}

