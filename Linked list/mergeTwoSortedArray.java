// MERGE TWO SOETED ARRAY

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode  dummyNode = new ListNode(-1);
        ListNode temp=dummyNode;

        ListNode l1=list1;
        ListNode l2=list2;

        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                temp.next=l1;
                temp=temp.next;
                l1=l1.next;
            }
            else if (l2.val<l1.val)
            {
                temp.next=l2;
                temp=temp.next;
                l2=l2.next;
            }

            


        }

        while(l1!=null)
        {
            temp.next=l1;
            temp=temp.next;
            l1=l1.next;
        }

         while(l2!=null)
        {
            temp.next=l2;
            temp=temp.next;
            l2=l2.next;
        }

        return dummyNode.next;
    }
}
