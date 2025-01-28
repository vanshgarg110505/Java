class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode middle = getMiddle(head);
        ListNode firstHalf = head;
        ListNode secondHalf = reverseList(middle.next);
        middle.next = null;
        merge(firstHalf, secondHalf);
    }

    public ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }

    public void merge(ListNode l1, ListNode l2){
        while (l2 != null) {
            ListNode temp1 = l1.next;
            ListNode temp2 = l2.next;

            l1.next = l2;
            l2.next = temp1; 

            l1 = temp1; 
            l2 = temp2; 
        }
    }
}
