class rootnode {
  int data;
  rootnode left;
  rootnode right;

  rootnode(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

}

public class graph {
  rootnode root;

  void insert(int data) {
    root = insert(root, data);
  }

  rootnode insert(rootnode root, int data) {
    if (root == null) {
      root = new rootnode(data);
      return root;
    }
    if (data > root.data) {
      root.right = insert(root.right, data);
    } else if (data < root.data) {
      root.left = insert(root.left, data);
    }
    return root;

  }

  void inorder() {
    System.out.println("inorder");
    inorderDisplay(root);
  }

  void inorderDisplay(rootnode root) {
    if (root != null) {
      inorderDisplay(root.left);
      System.out.println(root.data + " ");
      inorderDisplay(root.right);
    }
  }

  void preorder() {
    System.out.println("preorder");
    preorderDisplay(root);
  }

  void preorderDisplay(rootnode root) {

    if (root != null) {
      System.out.println(root.data);
      preorderDisplay(root.left);
      preorderDisplay(root.right);
    }
  }

  boolean search(int data) {
   return searchData(root, data);
  }


  boolean searchData(rootnode root,int data){
    if(root==null)
      return false;
    if (root.data==data) 
      return true;
      else if(data>root.data)
        return searchData(root.right, data);
      
      else
        return searchData(root.left, data);
       
  }
  public static void main(String[] args) {
    graph g = new graph();
    g.insert(10);
    g.insert(8);
    g.insert(1);
    g.insert(30);
    g.insert(20);
    g.inorder();
    g.preorder();
    System.out.println("element found is "+g.search(8));
  }
}
