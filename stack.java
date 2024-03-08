import java.util.*;
public class stack {
   public static void main(String[] args) {
    ArrayDeque<Character>  arr = new ArrayDeque<Character>();
     String s ="((())))(";
     int count1 =0;
     int count2 =0;
 for(char c: s.toCharArray()){
        if(c=='('){
            arr.push(c);
            count1 ++;

        }
        else if(c ==')'){
            count2++;
            if(!arr.isEmpty() && arr.peek() == '(')
            arr.pop();
            count1--;
            count2--;
        }
        else{
            System.out.println("invalid");
            return;
        }
   }
   if(count1== count2){
    System.out.println("valid");
   }
   else{
    System.out.println("invalid");
   }
   }
    
}