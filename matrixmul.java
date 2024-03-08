public class matrixmul {
    public static void main(String[] args) {
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr2[][] = { { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        int mat[][] = new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                mat[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    mat[i][j] += arr1[i][k] * arr2[k][i];
                }
            }

        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.err.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
