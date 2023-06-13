package Learning_Design_Patterns.StateDesignPattern.ConcreteStates;

import Learning_Design_Patterns.StateDesignPattern.State.DeliveryState;

public class ReceivedState implements DeliveryState{
    @Override
    public void Status() {
        System.out.println("Switching to Receiving State ....");
    }
}
