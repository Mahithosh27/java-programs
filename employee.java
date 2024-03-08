import java.util.*;

public class employee {
   static String name;
   static int id;
   static int days;
    static int salary;
    static int total;

     static int calculation(int days,int salary){
          total =  days*salary;
          return total;

     }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        name = sc.nextLine();
        System.out.println("enter the id");
        id = sc.nextInt();
        System.out.println("enter the number of days");




        
        days = sc.nextInt();
        System.out.println("enter the salary");
        salary = sc.nextInt();
        int t = calculation(days, salary);
        System.out.println("the total salary for the person"+ t);

    }

}
