package HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Dependency_Inversion_Principle_DIP;

import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Interface_Segregation_Principle_ISP.PaymentGateWay;

public class Booking {
    private final PaymentGateWay paymentGateWay;

    public Booking(PaymentGateWay paymentGateWay) {
        this.paymentGateWay = paymentGateWay;
    }

    public void bookTrip() {
        // logic for booking a trip
        System.out.println("Booking a One Trip");

        // process payment using the PaymentGateWay interface
        double totalCost = 100;
        paymentGateWay.processPayment(totalCost);
    }
}
/*

With this implementation, the Booking class does not depend on a concrete payment implementation
but instead depends on the PaymentGateWay interface.
This makes it easy to switch to a different payment implementation in the future
without modifying the Booking class.

 */