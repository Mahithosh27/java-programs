class node {
    public static final node right = null;
    int data;
    node next;
    public node left;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class singlyLinkedlist {

    node head = null;
    node tail = null;

    void addnode(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("empty");
        } else {
            node current = head;
            while (current != null) {
                System.out.println("linked LIst :" + current.data);
                current = current.next;
            }
        }
    }
    void arrAdd(int arr[]) {
        for (int i : arr) {
            addnode(i);
        }

    }
    void reverse(node current) {
        if(current == null) {
            return; 
        }
        
        reverse(current.next);
        
        System.out.print(current.data + " ");
    }
    

    public static void main(String[] args) {
        singlyLinkedlist sl = new singlyLinkedlist();
        sl.addnode(2);
        sl.addnode(4);
        sl.addnode(9);
        sl.addnode(10);
        // int arr[] = new int[] { 2, 3, 4, 6, 8 };
        // sl.arrAdd(arr);
        sl.reverse(sl.head);
        sl.display();
    }
}