// DELETE MIDDLE NODE OF THE LINKED LIST 


class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
        
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }

        if(len==1)
        {
            return [];
        }
    
         ListNode temp1=head;
         ListNode prev=head;
        for(int i=0;i<=(len/2)-1;i++)
        {
                 prev=temp1;
            temp1=temp1.next;
       
        }
        prev.next=temp1.next;

        return head;
    }
}


// USINH TWO POINTER


class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null ||head.next==null)
        {
            return null;
        }
        
       ListNode slow =head;
       ListNode fast=head;
                ListNode prev=head;
       while(fast!=null && fast.next!=null)
       {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
       }
       prev.next=slow.next;
       return head;
    }

}
