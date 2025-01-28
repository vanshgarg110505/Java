class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode reverseList = reverse(head);
        ListNode current = reverseList;
        while(current != null && current.next != null){
            if(current.val > current.next.val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return reverse(reverseList);
    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode rest = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
}
