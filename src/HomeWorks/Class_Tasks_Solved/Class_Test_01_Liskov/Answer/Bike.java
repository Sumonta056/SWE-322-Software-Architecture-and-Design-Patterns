package HomeWorks.ClassTasks.Class_Test_01_Liskov.Answer;

public class Bike implements VehicleAll {
    private int numGears;
    private int speed;

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setSpeed(int speed) {
        if (speed > 60) {
            throw new IllegalArgumentException("Bikes cannot go faster than 60 km/h");
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
