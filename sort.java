import java.util.*;
public class sort {
    void sorting(int arr[], int size) {
        int low = 0, mid = 0, high = size - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                default:
                    break;
            }

        }

    }

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element");
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        sort s = new sort();
        s.sorting(arr, i);
        System.out.println("sorted array is");
        for (i = 0; i < len; i++) {
            System.out.print(arr[i]);

        }
        sc.close();

    }

}