package HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Liskov_Substitution_Principle_LSP;

import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Single_Responsibility_Principle_SRP.AutoRickShaw;

public class CargoAutoRickshaw extends AutoRickshawType{
    private final int cargoCapacity;

    public CargoAutoRickshaw(AutoRickShaw auto, int cargoCapacity) {
        super(auto);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start() {
        System.out.println("Starting Cargo auto rickshaw");
    }

    @Override
    public void goForPayment() {
        System.out.println("Calculating payment for Cargo auto rickshaw");
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}
