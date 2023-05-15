package HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Single_Responsibility_Principle_SRP;

public class AutoRickShaw {
    private String id;
    private String driverName;
    private int numberOfPassengers;
    private int distance;


    // Constructor
    public AutoRickShaw(String id, String driverName, int numberOfPassengers,int distance) {
        this.id = id;
        this.driverName = driverName;
        this.numberOfPassengers = numberOfPassengers;
        this.distance = distance;

    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }


    public double getDistance() {
        return  distance ;
    }
}
/*
    - The code follows the Single Responsibility Principle
    - It is only responsible for creating and managing AutoRickShaw objects
    - This class does not have any additional responsibilities,
*/