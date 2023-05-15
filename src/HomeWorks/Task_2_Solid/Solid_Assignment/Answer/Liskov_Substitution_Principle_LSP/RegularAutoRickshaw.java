package HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Liskov_Substitution_Principle_LSP;

import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Single_Responsibility_Principle_SRP.AutoRickShaw;

public class RegularAutoRickshaw extends AutoRickshawType {
    public RegularAutoRickshaw(AutoRickShaw auto) {
        super(auto);
    }

    @Override
    public void start() {
        System.out.println("Starting regular auto rickshaw");
    }

    @Override
    public void goForPayment() {
        System.out.println("Calculating payment for regular auto rickshaw");
    }


}
