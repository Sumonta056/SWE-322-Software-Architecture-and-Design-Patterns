package HomeWorks.Task_2_Solid.Solid_Assignment.Answer;

import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Dependency_Inversion_Principle_DIP.Booking;
import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Interface_Segregation_Principle_ISP.BkashGateWay;
import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Interface_Segregation_Principle_ISP.CashPaymentGateway;
import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Liskov_Substitution_Principle_LSP.SharedAutoRickshaw;
import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Open_Closed_Principle_OCP.DaytimeFareCalculator;
import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Open_Closed_Principle_OCP.NighttimeFareCalculator;
import HomeWorks.Task_2_Solid.Solid_Assignment.Answer.Single_Responsibility_Principle_SRP.AutoRickShaw;

public class Client {
    public static void main(String[] args) {
        // Single Responsibility Principle
        // Creating an auto-rickshaw object
        AutoRickShaw ar = new AutoRickShaw("101" , "Abdul" , 6,6) ;
        System.out.println(ar.getId()+" "+
                ar.getDriverName()+" "
                +ar.getNumberOfPassengers()+" "
                +ar.getDistance());
        // Single Responsibility Principle

        // Liskov Substitution Principle
        // Selecting AutoRickshaw Type
        SharedAutoRickshaw auto = new SharedAutoRickshaw(ar,6);
        auto.start();
        auto.goForPayment();
        // Liskov Substitution Principle

        // Open Closed Principal
        // Fare Calculation for riding
        auto.setPricePerKM(20); // Setting Price Per KM
        DaytimeFareCalculator fare = new DaytimeFareCalculator();
        double amount = fare.calculateFare(auto);
        System.out.println("Trip Cost = "+amount);
        // Open Closed Principal


        // Interface Segregation Principle
        // Payment Method for paying fare
        CashPaymentGateway payment = new CashPaymentGateway();
        payment.processPayment(amount);
        // Interface Segregation Principle

        // Dependency Inversion Principle
        // Booking a one-day trip
        BkashGateWay bkash = new BkashGateWay();
        Booking book = new Booking(bkash);
        book.bookTrip();
        // Dependency Inversion Principle


    }
}
