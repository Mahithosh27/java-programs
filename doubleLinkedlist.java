class node {
    int data;
    node next;
    node prev;
    public Object left;

    node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class doubleLinkedlist {
    node head = null;
    node tail = null;

    void add(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;

        }
    }

    void display() {
        node current = head;
        if (head == null) {
            System.out.println("empty");
        } else {
            while (current != null) {
                System.out.println("double linkedlist " + current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        doubleLinkedlist dl = new doubleLinkedlist();
        dl.add(2);
        dl.add(30);
        dl.add(19);
        dl.display();

    }
}