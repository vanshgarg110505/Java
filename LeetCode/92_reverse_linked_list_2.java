class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for(int i = 1 ; i < left ; i++){
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode NextNode = null;

        for(int i = 0 ; i < right - left ; i++){
            NextNode = curr.next;
            curr.next = NextNode.next;
            NextNode.next = prev.next;
            prev.next = NextNode;
        }
        return dummy.next;
    }
}
