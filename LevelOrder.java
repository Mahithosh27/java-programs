import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

public class LevelOrder {
    Node root;

    LevelOrder() {
        root = null;
       
    }

    void print(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node tempNode = q.poll();
            System.out.println(tempNode.data);
            if (tempNode.left != null) {
                q.add(tempNode.left);
            }
            if (tempNode.right != null) {
                q.add(tempNode.right);
            }
        }
    }

    int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int heightleft = height(root.left);
            int heightright = height(root.right);
            return Math.max(heightleft, heightright) + 1;
        }
    }

    public static void main(String[] args) {
        LevelOrder l = new LevelOrder();
        l.root = new Node(1);
        l.root.left = new Node(2);
        l.root.right = new Node(3);
        l.root.left.left = new Node(4);
        l.root.left.right = new Node(5);

        l.print(l.root);
       System.out.println("height of the tree is " +l.height(l.root));
    }
}
