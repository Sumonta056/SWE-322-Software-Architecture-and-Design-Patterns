package HomeWorks.ClassTasks.Class_Test_01_Liskov.Question;

public class Car extends Vehicle {
    private int maxSpeed;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
