package Learning_Design_Patterns.StateDesignPattern;

import Learning_Design_Patterns.StateDesignPattern.ConcreteStates.DeliveredState;
import Learning_Design_Patterns.StateDesignPattern.ConcreteStates.ReceivedState;
import Learning_Design_Patterns.StateDesignPattern.Context.DeliverySystem;

public class Client {
    public static void main(String[] args) {

        // Creating a Delivery System Context
        DeliverySystem system = new DeliverySystem();
        system.status(); // Initially on Ordered State

        // switch to another State
        system.setState(new DeliveredState());
        system.status(); // now state switch to Delivered State

        // again Move to another State
        system.setState(new ReceivedState());
        system.status(); // now state switch to Received State

        /*
        Order State Running
        Switching to Delivery State ....
        Switching to Receiving State ....
         */
    }
}
