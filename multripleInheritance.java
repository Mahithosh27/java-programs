 interface android {
  void oneplus();
  void  samsung();
  void  nokia(String name);
    
}
 interface iphone {
  void  se(String name);
  void iphone(String name);
    
}

  class phone implements android,iphone{
   String name;
    final int sc= 6767676;
   
    phone(String name){
      this.name=name;
      
    }
    public void oneplus(){
        final int scNo =213313;
        System.out.println(name+ " buyed oneplus has green line in display and scNO "+scNo);
      }

      public void samsung(){
        System.out.println(name+" samsumg has 100X zoom the serial number is "+sc);
      }

      public void nokia(String name){
        System.out.println(name+" buyed nokia is un breakable the serial number is "+sc);
      }
      public void se(String name){
        System.out.println(name+ " buyed SE is the burget friendly phone , serial number is "+sc);
      }
    public  void iphone(String name ){
        System.out.println(name+ " buyed iphone battery package will be weak ,serial number is "+sc);
      }
}

public class multripleInheritance {
   public static void main(String[] args) {
    phone p = new phone("mahithosh");
    p.oneplus();
    p.nokia("mahithosh");
    p.samsung();
    p.iphone("mahithosh");
    p.se("mahithosh");
   } 
}
