public class matrixEvenOdd {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } };
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               
                int num = arr[i][j];
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("number of even "+even);
        System.out.println("number of odd "+ odd);
    }
}