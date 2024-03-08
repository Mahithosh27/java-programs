abstract class test {
    abstract void iphone();
}
class iphone8 extends test {
    void iphone(){
        System.out.println("iphone8");
    }
}
class iphone9 extends test {
    void iphone(){
        System.out.println("iphone9");
    }
}
class iphone10 extends test {
    void iphone(){
        System.out.println("iphone10");
    }
}
public class abstractIphone {
public static void main(String[] args) {
    test a = new iphone10(); 
    a.iphone();
}
    
}