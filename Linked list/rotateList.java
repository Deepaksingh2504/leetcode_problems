// ROTATE LIST
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        int len=0;

        if(head==null || k==0)
        {
            return head;
        }

        ListNode temp=head;

        while(temp!=null){
            len++;
            temp=temp.next;
        }

        k=k%len;

        if(k==0)
        {
            return head;
        }

        ListNode traverse=head;
        ListNode dummy=traverse;
        

        for(int i=1;i<len-k;i++)
        {
            dummy=dummy.next;    
        }
        
        ListNode nextPortion=dummy.next;
        dummy.next=null;

        ListNode trav=nextPortion;

        while(trav.next!=null)
        {
            trav=trav.next;
        }
        trav.next=traverse;

        return nextPortion;
    }
}
