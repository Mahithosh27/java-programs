import java.util.*;

public class ArrayListReverse {
 public static ArrayList<Integer> reverse (ArrayList<Integer> ls,int start,int end){
         while(start<end){
            Collections.swap(ls, start, end);
            start++;
            end--;
           
           
         }
         return ls;

    }

    public static void main(String[] args) {
      //   ArrayList<Integer> ls = new ArrayList<Integer>();
      //   ls.add(4);
      //   ls.add(7);
      //   ls.add(8);
      //   ls.add(2);
      //   int start = 0;
      //   int end = ls.size()-1;
      //  ArrayList<Integer> r= reverse(ls, start, end);
      //  System.out.println("reverse "+r);
      HashSet<Integer> hs = new HashSet<Integer>();
     hs.add(1);
      hs.add(2);
      hs.add(3);
      hs.add(4);
      hs.add(5);
     System.out.println( hs.contains(3));
       

    }

}
