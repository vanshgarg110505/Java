import java.util.*;

public class MaxHeap{
  // A pointer pointing to the elements in the array in the heap
  int[] arr;
  
  // Maximum possible size of the Max heap
  int maxSize;
  
  // Number of elements in Max Heap currently
  int heapSize;
  
  // Constructor Function 
  MaxHeap(int maxSize){
    this.maxSize = maxSize;
    arr = new int[maxSize];
    heapSize = 0;
  }
  
  // Heapifies a sub-tree taking the given index as the root 
  void MaxHeapify(int i){
    int l = lChild(i);
    int r = rChild(i);
    
    int largest = i;
    if(l < heapSize && arr[l] > arr[i]){
      largest = l;
    }
    if(r < heapSize && arr[r] > arr[i]){
      largest = r;
    }
    if(largest != i){
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;
      MaxHeapify(largest);
    }
  }
  
  // Returns the index of parent of element at the ith index
  int parent(int i){
    return (i - 1) / 2;
  }
  
  
  
  // returns the index of the left child 
  int lChild(int i){
    return (2 * i + 1);
  }
  
  // returns the index of the right child
  int rChild(int i){
    return (2 * i + 2);
  }
  
  //removes the root which in this case contains the maximum element
  int removeMax(){
    // checking whether the heap array is empty or not.
    if(heapSize <= 0){
      return Integer.MIN_VALUE;
    }
    if(heapSize == 1){
      heapSize--;
      return arr[0];
    }
    
    // Storing the maximum element to remove it.
    int root = arr[0];
    arr[0] = arr[heapSize - 1];
    heapSize--;
    
    // to restore the property of max heap 
    MaxHeapify(0);
    
    return root;
  }
  
  // Increases values of key at index i to new_val
  void increaseKey(int i, int newVal){
    arr[i] = newVal;
    while(i != 0 && arr[parent(i)] < arr[i]){
      int temp = arr[i];
      arr[i] = arr[parent(i)];
      arr[parent(i)] = temp;
      i = parent(i);
    }
  }
  
  // returns the maximum key, (key at root) from max heap
  int getMax(){
    return arr[0];
  }
  
  int curSize(){
    return heapSize;
  }
  
  // Deletes a key at given index i.
  void deleteKey(int i){
    // it increases the value of the key to Infinity and then removes the maximum value
    increaseKey(i, Integer.MAX_VALUE);
    removeMax();
  }
  
  // inserts a new key 'x' in the max heap
  void insertKey(int x){
    // to check whether the key can be inserted or not
    if(heapSize == maxSize){
      System.out.println("\nOverflow: Could not insertKey\n");
      return;
    }
    
    // the new key is initially inserted at the end.
    heapSize++;
    int i = heapSize - 1;
    arr[i] = x;
    
    // the max heap property is checked and if violation occurs, it is restored.
    while(i != 0 && arr[parent(i)] < arr[i]){
      int temp = arr[i];
      arr[i] = arr[parent(i)];
      arr[parent(i)] = temp;
      i = parent(i);
    }
  }
  
  // Driver program to test above functions.
  
  public static void main(String[] args){
    // Assuming the maximum size of the heap to be 15.
    MaxHeap h = new MaxHeap(15);
    
    // Asking the user to input the keys:
    int k , i , n = 6;
    System.out.println("Entered 6 keys :- 3, 10, 12, 8, 2, 14\n");
    h.insertKey(3);
    h.insertKey(10);
    h.insertKey(12);
    h.insertKey(8);
    h.insertKey(2);
    h.insertKey(14);
    
    // Printing the current size of the heap 
    System.out.println("The current size of the heap is :- " + h.curSize() + "\n");
    
    // Printing the root element which is actually the maximum element.
    System.out.println("The current maximum element is " + h.getMax() + "\n");
    
    // Deleting key at index 2 
    h.deleteKey(2);
    
    // Printing the size of the heap after deletion
    System.out.println("The current size of the heap is " + h.curSize() + "\n");
    
    // Inserting 2 new keys into the heap 
    h.insertKey(15);
    h.insertKey(5);
    
    System.out.println("The current size of the heap is " + h.curSize() + "\n");
    
    System.out.println("The current maximum element is " + h.getMax() + "\n");
  }
}
