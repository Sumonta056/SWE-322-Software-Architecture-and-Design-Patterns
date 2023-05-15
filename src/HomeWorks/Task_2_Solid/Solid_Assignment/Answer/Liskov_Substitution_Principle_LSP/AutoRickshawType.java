package HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Liskov_Substitution_Principle_LSP;

import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Single_Responsibility_Principle_SRP.AutoRickShaw;

public abstract class AutoRickshawType {

    private final AutoRickShaw auto;
    private double distance;
    private double PricePerKM;

    public AutoRickshawType(AutoRickShaw auto)
    {
        this.auto = auto;
    }

    public double getDistance()
    {
        distance = auto.getDistance() ;
        return distance;
    }

    public void setPricePerKM(double price)
    {
        PricePerKM = price ;
    }

    public double getPricePerKM()
    {
        return PricePerKM;
    }

    public abstract void start();

    public abstract void goForPayment();
}
