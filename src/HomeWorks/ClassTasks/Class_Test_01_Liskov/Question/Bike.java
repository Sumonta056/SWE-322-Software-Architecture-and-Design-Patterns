package HomeWorks.ClassTasks.Class_Test_01_Liskov.Question;

public class Bike extends Vehicle {
    private int numGears;

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
        super.setSpeed(speed);
    }
}
