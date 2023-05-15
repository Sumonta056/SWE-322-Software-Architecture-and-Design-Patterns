package HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Liskov_Substitution_Principle_LSP;

import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Single_Responsibility_Principle_SRP.AutoRickShaw;

public class SharedAutoRickshaw extends AutoRickshawType{
    private final int maxPassengers;

    public SharedAutoRickshaw(AutoRickShaw auto, int maxPassengers) {
        super(auto);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void start() {
        System.out.println("Starting shared auto rickshaw");
    }

    @Override
    public void goForPayment() {
        System.out.println("Calculating payment for shared auto rickshaw");
    }
}
