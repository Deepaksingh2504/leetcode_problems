// ODD EVEN ORDERED LINKED LIST


class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        ListNode dummyNode1=new ListNode(-1);
         ListNode dummyNode2=new ListNode(-1);
         ListNode traverse1=dummyNode1;
         ListNode traverse2=dummyNode2;


        ListNode temp=head;
        int i=1;
        while(temp!=null)
        {
            if(i%2==0)
            {
                traverse2.next=temp;
                traverse2=traverse2.next;
            }
            else
            {
                 traverse1.next=temp;
                traverse1=traverse1.next;
            }
            temp=temp.next;

            traverse1.next=null;
            traverse2.next=null;
            i++;
        }
        traverse1.next=dummyNode2.next;

        

    return dummyNode1.next;
    }
}
