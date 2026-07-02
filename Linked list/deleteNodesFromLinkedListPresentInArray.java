// DELETE NODES FROM LINKED LIST PRESENT IN ARRAY


class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer>set=new HashSet<>();

        for(int v:nums)
        {
            set.add(v);
        }

        ListNode dummy =new ListNode(-1);
        ListNode traverse=dummy;

        while(head!=null)
        {
            if(!set.contains(head.val))
            {
                traverse.next=head;
                traverse=traverse.next;
            }
            head=head.next;
               
        }
        traverse.next=null;

        return dummy.next;
    }
}
