// Parent class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Child class inheriting Parent
class Bike extends Vehicle {
    // Overriding the run method of parent class
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class Q35_MethodOverriding {
    public static void main(String[] args) {
        // Creating object of child class
        Bike myBike = new Bike();
        myBike.run(); // This will call the Bike's run method, not Vehicle's
    }
}