import java.util.*;

public class Main {
    public static void main(String[] args) {
      // Create a Priority Queue with initial capacity 10
      PriorityQueue<Integer> pq = new PriorityQueue<>(10);
      
      // add elements to queue
      pq.add(3);
      pq.add(1);
      pq.add(2);
      pq.add(5);
      pq.add(4);
      
      // print queue
      System.out.println(pq);
      
      // peek at top element of queue
      System.out.println(pq.peek());
      
      // remove the top element of queue
      pq.poll();
      
      // print queue again
      System.out.println(pq);
      
      // check if queue contains a specific element
      System.out.println(pq.contains(3));
      
      // check size of queue
      System.out.println(pq.size());
      
      // remove all elements from queue
      pq.clear();
      
      // check if queue is empty or not 
      System.out.println(pq.isEmpty());
  }
}
