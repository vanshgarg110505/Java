class SegmentTreeNode{
  // range of indices covered by this node
  int start, end;
  
  // sum of values in the range
  int sum;
  
  // pointers to left and right child nodes
  SegmentTreeNode left, right;
  
  public SegmentTreeNode(int start, int end){
    this.start = start;
    this.end = end;
    this.sum= 0;
    this.left = null;
    this.right = null;
  }
}

public class SegmentTree{
  // root of segment tree 
  private SegmentTreeNode root;
  
  public SegmentTree(int[] nums){
    root = buildTree(nums, 0, nums.length - 1);
  }
  
  // build the tree 
  private SegmentTreeNode buildTree(int[] nums, int start, int end){
    if(start > end){
      return null; // empty node 
    }
    
    SegmentTreeNode node = new SegmentTreeNode(start, end);
    
    if(start == end){
      node.sum = nums[start];
    }
    else{
      int mid = start + (end - start) / 2;
      
      // build the left subtree
      node.left = buildTree(nums, start, mid);
      
      // build the right subtree
      node.right = buildTree(nums, mid + 1 , end);
      
      // combine the values from children
      node.sum = node.left.sum + node.right.sum;
    }
    return node;
  }
  
  // query the range sum [i, j]
  public int rangeSum(int i , int j){
    return rangeSum(root, i , j);
  }
  
  private int rangeSum(SegmentTreeNode node, int start, int end){
    if(node == null || start > node.end || end < node.start){
      return 0;
    }
    
    if(start <= node.start && end >= node.end){
      // full covered by this node 
      return node.sum;
    }
    return rangeSum(node.left, start, end) + rangeSum(node.right, start, end);
  }
  
  // update the value at index i 
  public void update(int i, int val){
    update(root, i, val);
  }
  
  private void update(SegmentTreeNode node, int index, int val){
    if(node.start == node.end){
      node.sum = val;
    }
    else{
      int mid = node.start + (node.end - node.start) / 2;
      
      if(index <= mid){
        // update left subtree
        update(node.left, index, val);
      }
      else{
        // update right subtree
        update(node.right, index, val);
      }
      
      // recalculate sum 
      node.sum = node.left.sum + node.right.sum;
    }
  }
  
  // main function 
  public static void main(String[] args){
    int nums[] = {1,3,5,7,9,11};
    SegmentTree segmentTree = new SegmentTree(nums);
    
    System.out.println("Range Sum (0,2) :- " + segmentTree.rangeSum(0,2));
    
    segmentTree.update(1,10);
    
    System.out.println("Range Sum (0,2) :- " + segmentTree.rangeSum(0,2));
  }
}














