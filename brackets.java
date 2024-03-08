public class brackets {
    void brackets(String brackets, int open, int close) {
        if (open == 0 && close == 0) {
            System.out.println(brackets);
            return;
        }
        if (open > 0) 
            brackets(brackets + "(", open - 1, close);
        if (close > 0) 
            brackets(brackets + ")", open, close - 1);
        
    }

    public static void main(String[] args) {
        int n = 2;
        brackets bl = new brackets();
        bl.brackets("", n, n);
    }
    
}
