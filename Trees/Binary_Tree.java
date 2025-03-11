class Node{
  int key;
  Node left, right;
  
  public Node(int key){
    this.key = key;
    left = right = null;
  }
}

class BinaryTree{
  Node root;
  
  BinaryTree(){
    root = null;
  }
  
  void insert(int key){
    root = insertRec(root, key);
  }
  
  Node insertRec(Node root, int key){
    if(root == null){
      root = new Node(key);
      return root;
    }
    
    if(key < root.key){
      root.left = insertRec(root.left, key);
    }
    
    else if(key > root.key){
      root.right = insertRec(root.right, key);
    }
    
    return root;
  }
  
  void display(){
    inOrderTraversal(root);
    System.out.println();
  }
  
  
  void inOrderTraversal(Node node){
    if(node != null){
      inOrderTraversal(node.left);
      System.out.println(node.key + " ");
      inOrderTraversal(node.right);
    }
  }
  
  public static void main(String[] args){
    BinaryTree tree = new BinaryTree();
    
    tree.insert(50);
    tree.insert(30);
    tree.insert(70);
    tree.insert(20);
    tree.insert(40);
    tree.insert(60);
    tree.insert(80);
    
    tree.display();
  }
}
