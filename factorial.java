public class factorial {
    static int fac(int num) {
        int ans = 1;
        for (int i = 2; i <= num; i++) {
           System.out.println( ans *= i);
        }
        return ans;
    }

    static int fac1(int num1) {
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
           System.out.println( sum += 1);
        }
        return sum;
    }
      
    public static void main(String[] args) {
        int num = 5;
        
        int fac1 = fac(num);
        fac1(fac1);
    }
}
