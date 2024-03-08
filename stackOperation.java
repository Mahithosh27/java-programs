public class stackOperation {
    static int size;
    static int[] arr;
    static int top;

    stackOperation(int size) {
        this.size = size; 
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("stack is full");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (isempty()) {
            System.out.println("stack is empty");
            return -1; 
        }
        int a=arr[top]; 
        arr[top--]=0;
        return a;
    }

    static boolean isempty() {
        return top == -1;
    }

    public static void main(String[] args) {
        stackOperation stack = new stackOperation(10);
        System.out.println();
        stack.push(4);
        stack.push(5);
        stack.push(9);
        stack.pop();
       for (int i = 0; i <=top; i++) {
        System.out.println(arr[i]);
       }
        
    }
}
