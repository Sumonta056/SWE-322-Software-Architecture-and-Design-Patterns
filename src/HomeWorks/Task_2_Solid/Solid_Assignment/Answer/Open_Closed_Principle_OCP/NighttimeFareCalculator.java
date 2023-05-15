package HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Open_Closed_Principle_OCP;

import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Liskov_Substitution_Principle_LSP.AutoRickshawType;
import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Single_Responsibility_Principle_SRP.AutoRickShaw;

public class NighttimeFareCalculator implements FareCalculator {

    private static final double PricePerKM = 0;

    @Override
    public double calculateFare(AutoRickshawType autoRickShaw) {
        double distance = autoRickShaw.getDistance();
        double PricePerKM = autoRickShaw.getPricePerKM();
        return (PricePerKM * distance);
    }
}