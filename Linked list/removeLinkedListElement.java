// REMOVE LINKED LIST ELEMENT

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        

        ListNode temp=new ListNode(-1);
        temp.next=head;

        ListNode traverse=temp;

        while(traverse!=null)
        {
        
            while(traverse.next!=null && traverse.next.val==val)
            {
            traverse.next=traverse.next.next;
            }
            traverse=traverse.next;
        }

        return temp.next;
    }
}
