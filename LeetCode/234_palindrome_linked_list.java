class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode middle = getMiddle(head);
        ListNode secondHalf = reverseList(middle);
        ListNode firstHalf = head;
        while(secondHalf != null){
            if(firstHalf.val != secondHalf.val){
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
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
}
