package HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Interface_Segregation_Principle_ISP;

public class BkashGateWay implements PaymentGateWay{
    @Override
    public void processPayment(double amount) {
        System.out.println("Taking Payment in Bkash");

    }
}
