import java.util.*;

class Node{
  int key;
  Node left, right;
  
  public Node(int key){
    this.key = key;
    left = right = null;
  }
}

// Binary Search Tree class

class BinarySearchTree{
  Node root;
  
  // Constructor
  BinarySearchTree(){
    root = null;
  }
  
  // Insert Method
  void insert(int key){
    root = insertRec(root, key);
  }
  
  Node insertRec(Node root, int key){
    if(root == null){
      return new Node(key);
    } 
    
    if(key < root.key){
      root.left = insertRec(root.left, key);
    }
    else if(key > root.key){
      root.right = insertRec(root.right, key);
    }
    return root;
  }
  
  // Search Method
  boolean search(int key){
    return searchRec(root, key);
  }
  
  boolean searchRec(Node root, int key){
    if(root == null){
      return false;
    }
    if(root.key == key){
      return true;
    }
    
    return key < root.key ? searchRec(root.left, key) : searchRec(root.right, key);
  }
  
  // In-Order Traversal  (left, root, right)
  
  void inorder(){
    inorderRec(root);
    System.out.println();
  }
  
  void inorderRec(Node root){
    if(root != null){
      inorderRec(root.left);
      System.out.print(root.key + " ");
      inorderRec(root.right);
    }
  }
  
  // Delete Record
  void delete(int key){
    root = deleteRec(root, key);
  }
  
  Node deleteRec(Node root, int key){
    if(root == null){
      return root;
    }
    if(key < root.key){
      root.left = deleteRec(root.left, key);
    }
    else if(key > root.key){
      root.right = deleteRec(root.right, key);
    }
    else{
      // Node with only 1 child or no child
      if(root.left == null) return root.right;
      if(root.right == null) return root.left;
      
      // Node with 2 children
      root.key = minValue(root.right);
      root.right = deleteRec(root.right, root.key);
    }
    return root;
  }
  
  // Find the minimum value Node
  int minValue(Node root){
    int minValue = root.key;
    while(root.left != null){
      minValue = root.left.key;
      root = root.left;
    }
    return minValue;
  }
  
  // Find the maximum value Node
  int maxValue(Node root){
    int maxValue = root.key;
    while(root.right != null){
      maxValue = root.right.key;
      root = root.right;
    }
    return maxValue;
  }
  
  
  // Main Method
  public static void main(String[] args){
    BinarySearchTree bst = new BinarySearchTree();
    
    // Inserting Values
    bst.insert(50);
    bst.insert(30);
    bst.insert(70);
    bst.insert(20);
    bst.insert(40);
    bst.insert(60);
    bst.insert(80);
    
    System.out.print("Inorder Traversal: ");
    bst.inorder();

    // Searching for a value
    System.out.println("Search 40: " + bst.search(40)); // true
    System.out.println("Search 90: " + bst.search(90)); // false

    // Deleting a node
    System.out.println("Deleting 30...");
    bst.delete(30);
    System.out.print("Inorder Traversal after deletion: ");
    bst.inorder();
    
    // Minimum and Maximum Values
    System.out.println("Minimum value in BST :" + bst.minValue(bst.root));
    System.out.println("Maximum value in BST :"+ bst.maxValue(bst.root));
  }
}
