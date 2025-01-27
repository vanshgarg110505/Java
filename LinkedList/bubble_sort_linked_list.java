class Solution{
  public ListNode bubbleSortList(ListNode head){
    if(head == null || head.next == null){
      return head;
    }
    
    boolean swapped;
    ListNode current;
    ListNode last = null;
    
    do{
      swapped = false;
      current = head;
      while(current.next != last){
        if(current.val > current.next.val){
          int temp = current.val;
          current.val = current.next.val;
          current.next.val = temp;
          swapped = true;
        }
        current = current.next;
      }
      
      last = current;
    }while(swapped);
    return head;
  }
}
