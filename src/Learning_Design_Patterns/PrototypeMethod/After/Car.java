package Learning_Design_Patterns.PrototypeMethod.After;

public class Car implements Prototype {
    public String carName;
    private int carPrice;
    private int carNumber;
    private String carColor;

    public Car() {
    }


    public Car(String carName, int carPrice, int carNumber, String carColor) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.carNumber = carNumber;
        this.carColor = carColor;
    }

//    public Car(Car car) {
//        if(car != null){
//            this.carName = car.carName;
//            this.carPrice =  car.carPrice;
//            this.carNumber =  car.carNumber;
//            this.carColor =  car.carColor;
//        }
//    }
//
//    public Car CLONE()
//    {
//        return new Car(this);
//    }


    public void draw() {
        System.out.println("Car Specification" +
                "Car Name : " + carName +  "\n" +
                "Car Price : " + carPrice +  "\n" +
                "Car Number : " + carNumber +  "\n" +
                "Car Color : " + carColor
        );
    }

    @Override
    public Car getClone() {
        return new Car(carName,carPrice,carNumber,carColor);
    }
}

