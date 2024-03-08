public class vechicle {
    public static void main(String[] args) {
        
    
    new car();
    new bike("royal enfield", "bullet");

}
}

class vechicleDetails {
    String speed;
    String mileage;
    String colour = "black";
    String colour1 = "blue";

    vechicleDetails() {
        System.out.println("vechicle details");
    }

}

class car extends vechicleDetails {
    car() {
        System.out.println("colour of the car is " + colour);
    }
}

class bike extends vechicleDetails {
    bike(String bike, String bike_model) {
        System.out.println("colour of bike " + colour1);
        System.out.println("bike brand" + bike);
        System.out.println("bike model" + bike_model);
    }
}
