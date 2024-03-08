import java.util.Stack;

public class palindrome {

    static boolean palin(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        // StringBuilder sb = new StringBuilder();
        String sb="";
        for (int i = 0; i < s.length(); i++) {
            sb+=stack.pop();
        }
        System.out.println();
        if (s.equals(sb)) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        if (palin("madam")) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
