class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode middle = getMiddle(head);
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;
        
        left = sortList(left);
        right = sortList(right);
        
        return merge(left, right);
    }
    
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    private ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val <= l2.val){
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}
