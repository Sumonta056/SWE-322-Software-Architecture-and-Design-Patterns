package Learning_Design_Patterns.Prototype.Before;

public class Car {
    public String carName;
    private int carPrice;
    private int carNumber;
    private String carColor;

    public Car(){};
    public Car(String carName,int carPrice,int carNumber,String carColor) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.carNumber = carNumber;
        this.carColor = carColor;
    }

    public void draw() {
        System.out.println("Car Specification" +
                        "Car Name : " + carName +
                        "Car Price : " + carPrice +
                        "Car Number : " + carNumber +
                        "Car Color : " + carColor
                            );
    }

}

