// PALINDROME LINKED LIST


class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode current=slow;
        ListNode prev=null;
        ListNode future=slow;

        while(current!=null)
        {
            future=current.next;
            current.next=prev;
            prev=current;
            current=future;
        }

        while(prev!=null)
        {
            if(prev.val!=head.val)
            {
                return false;
            }
            prev=prev.next;
            head=head.next;
        }
        return true;
    }
}
