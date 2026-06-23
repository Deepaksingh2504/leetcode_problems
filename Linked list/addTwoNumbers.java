//ADD TWO NUMBERS 


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummyNode =new ListNode(-1);
        ListNode temp=dummyNode;

        int carry=0;

        while(l1!=null && l2!=null)
        {
            int sum=0;

            if(l1!=null)
            {
                sum+=l1.val;
            }

            if(l2!=null)
            {
                sum+=l2.val;
            }
            sum+=carry;

            temp.next=new ListNode(sum%10);
            carry=sum/10;

            l1=l1.next;
            l2=l2.next;
            temp=temp.next;
        }

         while(l1!=null)
         {

            int sum=0;
            sum+=l1.val+carry;
            temp.next=new ListNode(sum%10);
            carry=sum/10;
            l1=l1.next;
            temp=temp.next;
            
         }

          while(l2!=null)
         {

            int sum=0;
            sum+=l2.val+carry;
            temp.next=new ListNode(sum%10);
            carry=sum/10;
            l2=l2.next;
            temp=temp.next;
            
         }

        if(carry>0)
        {
            temp.next=new ListNode(carry);
        }

        return dummyNode.next;
    }
}
