class vechicle1{
    void run(){
        System.out.println("vechicle");
    }
} 
class car1 extends vechicle  { 
  void run(){
   System.out.println("car");
  }
}
public class overriding { 
    public static void main(String[] args) {
     car1 c = new car1();
     c.run();
    }
}
 