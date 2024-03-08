public class remove {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 3, 5, 7, 8, 1, 1, 2, 2, 1 };
        int vistited[] = new int[10];
        for (int i = 0; i < vistited.length; i++) {
            vistited[arr[i]] += 1;

        }

        for (int i = 0; i < vistited.length; i++) {

            System.out.println(vistited[i]);

        }

    }

}
