public class multrilevelcar {
     String type = "sedan";
    int averageSpped =60;
    int averagemileage= 18;
    void asd(){
        System.out.println("type of car " +type);
        System.out.println("average speed "+averageSpped);
        System.out.println("average mileaage "+averagemileage);
    }
}

class tata extends multrilevelcar{
    String display=" led display";
    String AC   ="full AC";
    tata(){
        System.out.println("tata has"+display+" "+AC+" "+averageSpped+" "+averagemileage);
    }
}

class punch extends tata{
    String colour ="black";
    String model = "gear";
    void punch(){
        System.out.println("punch car has "+colour+"colour and "+model);
    }
}
class harrier extends punch {
    int mileaage;
     harrier(int distance,int fuel){
      mileaage = distance/fuel;
      System.out.println("mileage "+mileaage);
      punch();
      asd();
     }
     public static void main(String[] args) {
      harrier hr = new harrier(10, 2);
     }
    
}