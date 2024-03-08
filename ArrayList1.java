
import java.util.*;

public class ArrayList1 {

    // ArrayList<Integer> rotate(ArrayList<Integer> number, int n) {
    //     for (int i = 0; i < n; i++) {
    //         number.addFirst(getlast(number));
    //         int a = getLast(number);
    //         return a
    //     }
    // }

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(100);
        number.add(7);
        number.add(20);
        number.add(22);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        // System.out.println(number);
        // System.out.println( number.get(2));
        // System.out.println(number.set(3, 50));
        // for(int i : number){
        // System.out.println(i);
        // }
        // System.out.println(number.(number));
        // for (Integer i :number) {
        // number.remove(i);
        // }
        // number.add(15);
        // System.out.println(number);

        int min = number.get(1);
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            int current = number.get(i);
            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }

        }
        System.out.println("max " + max);
        System.out.println("min " + min);
         System.out.println(getLast(number));
    }
}
