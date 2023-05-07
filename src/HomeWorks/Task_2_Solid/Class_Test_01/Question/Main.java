package HomeWorks.Task_2_Solid.Class_Test_01.Question;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Bike();
        vehicle.setSpeed(70); // This will throw an IllegalArgumentException
    }
}