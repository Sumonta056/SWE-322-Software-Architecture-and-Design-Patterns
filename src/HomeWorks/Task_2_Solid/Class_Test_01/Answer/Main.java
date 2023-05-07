package HomeWorks.Task_2_Solid.Class_Test_01.Answer;

//The code violates the Liskov substitution principle (LSP) of the SOLID principles

public class Main {
    public static void main(String[] args) {
        VehicleAll vehicle =  new Bike();
        vehicle.setSpeed(60); // This is allowed
        vehicle.setSpeed(70); // This will throw an IllegalArgumentException
    }
}