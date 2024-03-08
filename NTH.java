public class NTH {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 33, 55, 77, 11 };
        int smallest = 2;
        int largest = 2;
        System.out.println("length" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("smallest " + arr[smallest - 1]);
        System.out.println("largest " + arr[(arr.length) - largest]);

        int start = 0;
        int end = arr.length - 1;
        int i = 0;
        while (start < end) {
            arr[i++] = end--;
            arr[i++] = start++;

        }

        System.out.println("laarge and small");

        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
