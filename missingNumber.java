import java.util.Arrays;

// public class missingNumber {
//     static void sort(int arr[]){
//      for (int i = 0; i < arr.length; i++) {
//         for (int j = i+1; j < arr.length; j++) {
//             if(arr[j]<arr[i]){
//                 int temp = arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//             }
//         }
//      }
//     }

//     static int missingnumber1(int arr[]){
//      for (int i = 0; i < arr.length; i++) {
//         if(arr[i]!=i+1){
//             return i+1;
//         }

//      }
//     return 0;
//     } 
//     public static void main(String[] args) {
//         int arr[]={2,3,4,5,9,4};
//         Arrays.sort(arr);
//         // System.out.println(arr);
//     //    sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//         System.out.println(arr[i]);
//        }
//        System.out.println(missingnumber1(arr));

//     }

// }

//----------------------------------------------------------------->

import java.util.*;

public class missingNumber {
  static int missingNumber2(ArrayList<Integer> al) {
    for (int i = 0; i < al.size(); i++) {
      if (al.get(i) != i + 1) {
        return i + 1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int arr[] = { 3, 6, 5, 7, 2, 9 };
    ArrayList<Integer> al = new ArrayList<>();
    for (int num : arr) {
      al.add(num);
    }
    al.sort(Comparator.naturalOrder());
    int max1 = Collections.max(al);
    System.out.println(max1);

    System.out.println(al);
    Collections.sort(al);
    System.out.println(al);
    System.out.println("missing number " + missingNumber2(al));

  }

}

// multriple missing
// number-------------------------------------------------------------->

// public class missingNumber{
// static void findmissing(int[] arr){
// int max = Arrays.stream(arr).max().getAsInt();
// boolean present [] = new boolean[max+1];
// for (int i : arr) {
// present[i]=true;
// }

// for (int i = 0; i < present.length; i++) {
// if(present[i]!=true){
// System.out.println(i);
// }

// }
// }
// public static void main(String[] args) {

// int arr [] ={2,8,3,1,4};
// findmissing(arr);
// }
// }
