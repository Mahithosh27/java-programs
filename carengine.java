
interface engine {
    void start();
    void stop();
}

interface features {
    void ac();
    void sunRoof();
}

abstract class vehicle {
    public vehicle(String model) {
        System.out.println("vehicle is ready to run and model is " + model);
    }
}

class car extends vehicle implements engine, features {

    public car(String model) {
        super(model);
    }

    public void start() {
        System.out.println("engine is started");
    }

    public void stop() {
        System.out.println("engine is stopped");
    }

    public void ac() {
        System.out.println("the vehicle has high temperature");
    }

    public void sunRoof(){
        System.out.println("the car has sunroof");
    }

}

public class carengine {
    public static void main(String[] args) {

        car c = new car("thar");
        c.start();
        c.ac();
        c.start();
        c.sunRoof();

    }
}
