import org.w3c.dom.Node;


class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class circularLinkedlist {
    node head = null;
    node tail = null;

    void add(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            tail.next = head;
        } else {
            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }
    }
    public static void deleteUsingRecursion(int data,node head,node next){
        if(next==null){
            next=head.next;
        }
        if(head==null){
            return;
        }
        else if(next.data==data){
            head.next=next.next;
        }
        deleteUsingRecursion(data, next, next.next);
    }
    void forntdelete() {
        System.out.println("deleting the first------------------------- ");
        if (head != tail) {
            head = head.next;
            tail.next = head;

        } else {
            head = tail = null;
        }
    }

    void insertpos(int pos, int data) {
        System.out.println("insert--------------");
        node temp = head;
        node newnode = new node(data);
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;

        }
        newnode.next = temp.next;
        temp.next = newnode;

    }
    public static node insertUsingRecursion(int pos,node current,int data){
        if(current==null){
            return null;
        }
        else if(current.data==pos){
          node  temp=new node(data);
            temp.next=current;
            return temp;
        }
        else{
            current.next = insertUsingRecursion(pos, current.next, data);
        }
        return current;
    }
    void display() {
        node current = head;
        if (head == null) {
            System.out.println("empty");
        } else {

            do {
                System.out.println("linkist " + current.data);
                current = current.next;
            } while (current != head);

        }
    }

    void search(int val) {
        boolean flag = false;
        node current = head;
        int i = 0;
        do {
            if (current.data == val) {
                flag = true;
                break;
            }
            i++;
            current = current.next;
        } while (current.next != head);
        if (flag = true) {
            System.out.println("element found at  :" + i);
        } else {
            System.out.println("not found ");
        }
    }
    public static void printLinkedList(node head) {
        node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        // circularLinkedlist cl = new circularLinkedlist();
        // cl.add(4);
        // cl.add(5);
        // cl.add(6);
        // cl.display();
        // cl.forntdelete();
        // cl.display();
        // cl.insertpos(2, 5);
        // cl.display();
        // cl.search(6);
        // cl.add(7);
        // cl.display();
        // Create nodes with values 1, 2, 3, 4, 5, 7
        node head = new node(1);
        node second = new node(2);
        node third = new node(3);
        node fourth = new node(4);
        node fifth = new node(5);
        node sixth = new node(7);

        // Connect the nodes to form the linked list
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        System.out.println("before:");
        printLinkedList(head);
        // circularLinkedlist.deleteUsingRecursion(7,head , null);
        head=insertUsingRecursion(4, head, 9);
        System.out.println("Affter:");
        printLinkedList(head);

    }
}
