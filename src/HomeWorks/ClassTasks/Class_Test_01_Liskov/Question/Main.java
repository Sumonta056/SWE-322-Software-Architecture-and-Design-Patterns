package HomeWorks.ClassTasks.Class_Test_01_Liskov.Question;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Bike();
        vehicle.setSpeed(70); // This will throw an IllegalArgumentException
    }
}