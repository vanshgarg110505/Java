class Node{
  int key, height;
  Node left, right;
  
  Node(int key){
    this.key = key;
    height = 1;
  }
}

class AVLTree{
  Node root;
  
  // Get height of a Node
  int height(Node N){
    return (N == null) ? 0 : N.height;
  }
  
  // Get Balance Factor of Node
  int getBalance(Node N){
    return (N == null) ? 0 : height(N.left) - height(N.right);
  }
  
  // Right rotate
  Node rightRotate(Node y){
    Node x = y.left;
    Node T2 = x.right;
    
    x.right = y;
    y.left = T2;
    
    y.height = Math.max(height(y.left), height(y.right)) + 1;
    x.height = Math.max(height(x.left), height(x.right)) + 1;
    
    return x;
  }
  
  // Left rotate
  Node leftRotate(Node x){
    Node y = x.right;
    Node T2 = y.left;
    
    y.left = x;
    x.right = T2;
    
    x.height = Math.max(height(x.left), height(x.right)) + 1;
    y.height = Math.max(height(y.left), height(y.right)) + 1;
    
    return y;
  }
  
  // Insert a Node
  Node insert(Node node, int key){
    if(node == null){
      return new Node(key);
    }
    
    if(key < node.key){
      node.left = insert(node.left, key);
    }
    else if(key > node.key){
      node.right = insert(node.right, key);
    }
    else{
      return node;
    }
    
    node.height = Math.max(height(node.left), height(node.right)) + 1;
    
    int balance = getBalance(node);
    
    // LL case
    if(balance > 1 && key < node.left.key){
      return rightRotate(node);
    }
    
    // RR case
    if(balance < -1 && key > node.right.key){
      return leftRotate(node);
    }
    
    // LR case
    if(balance > 1 && key > node.left.key){
      node.left = leftRotate(node.left);
      return rightRotate(node);
    }
    
    // RL case
    if(balance < -1 && key < node.right.key){
      node.right = rightRotate(node.right);
      return leftRotate(node);
    }
    
    return node;
  }
  
  // In-order traversal
  void inorder(Node root){
    if(root != null){
      inorder(root.left);
      System.out.print(root.key + " ");
      inorder(root.right);
    }
  }
  
  public static void main(String[] args){
    AVLTree tree = new AVLTree();
    
    tree.root = tree.insert(tree.root, 10);
    tree.root = tree.insert(tree.root, 20);
    tree.root = tree.insert(tree.root, 30);
    tree.root = tree.insert(tree.root, 40);
    tree.root = tree.insert(tree.root, 50);
    tree.root = tree.insert(tree.root, 25);
    
    System.out.print("In-order Traversal: ");
    tree.inorder(tree.root);  // Sorted order
  }
}
