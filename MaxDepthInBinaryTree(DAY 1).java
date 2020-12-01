class Node  
{ 
  int data; 
  Node left, right; 
   
  Node(int val)  
  { 
    data = val; 
    left = right = null; 
  } 
}

class BinaryTree  
{ 
  Node root;
  int maxDepth(Node root)  
  { 
    if (root == null) 
      return 0; 
    int left = maxDepth(root.left); 
    int right = maxDepth(root.right); 
    return Math.max(left, right)+1;
  } 
      

  public static void main(String[] args)  
  { 
    BinaryTree tree = new BinaryTree(); 
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.right.left = new Node(5);
    tree.root.right.right = new Node(6);
    tree.root.right.right.left = new Node(8);
    tree.root.right.left.right = new Node(7);
    System.out.println("Max depth: " + tree.maxDepth(tree.root));              
  } 
} 