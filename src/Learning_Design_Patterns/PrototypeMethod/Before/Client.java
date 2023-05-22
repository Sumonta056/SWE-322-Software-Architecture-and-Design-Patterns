package Learning_Design_Patterns.PrototypeMethod.Before;

public class Client {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari",20000000,2045,"Red");

//        Trying to copy car2 into car1
//        Car car2 = new Car();

//        car2.carName = car1.carName;   --> allowed to  copy cause public attributes
//        car2.carColor = car1.carColor;  --> Private Member can't be copied
//        car2.carNumber = car1.carNumber;  --> Private Member can't be copied
//        car2.carPrice = car1.carPrice;  --> Private Member can't be copied

        /*
            Problem 1 - you have to copy element one by one
            Problem 2 - Cannot copy private member
            Problem 3 - in Future if you add any member to car1
                        you also have to manually copy member car1 to car2
            Problem 4 - Copying is tightly coupled and depends on car class
            Problem 5 - Sometimes we may not have access to the class
                        In that case we can not copy a class object
        */
    }
}