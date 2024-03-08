public class Zoo {
    public static void main(String[] args) {
        lion l =new lion();
        l.sound();
        dog d = new dog();
        d.sound();
        cat c = new cat();
        c.sound();
    }
}
class lion extends Zoo {
    void sound(){
        System.out.println("lion sounds roars");
    }
} 
class dog extends Zoo{
    void sound(){
        System.out.println("dog sounds bow bow");
    }
}
class cat extends Zoo{
    void sound(){
        System.out.println("cat sounds meow meow");
    }
}
