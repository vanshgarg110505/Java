class Solution{
  public int lengthCycle(ListNode head){
    ListNode slow = head;
    ListNode fast = head;
    
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
      
      if(slow == fast){
        int length = 0;
        ListNode temp = slow;
        while(true){
          temp = temp.next;
          length++;
          if(temp == fast){
            break;
          }
        }
        return length;
      }
    }
    return 0;
  }
}
