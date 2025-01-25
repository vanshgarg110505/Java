public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode pointer = head;
                while(pointer != slow){
                    pointer = pointer.next;
                    slow = slow.next;
                }
                return pointer;
            }
        }
        return null;
    }
}
