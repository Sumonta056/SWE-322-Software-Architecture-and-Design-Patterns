package Learning_Design_Patterns.PrototypeMethod.After;


public class Client {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari",20000000,2045,"Red");

        // Copying Object having private value
        Car car2 = car1.getClone();
        car2.draw();
    }


}