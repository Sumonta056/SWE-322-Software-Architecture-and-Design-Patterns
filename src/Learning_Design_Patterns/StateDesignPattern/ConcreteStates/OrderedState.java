package Learning_Design_Patterns.StateDesignPattern.ConcreteStates;

import Learning_Design_Patterns.StateDesignPattern.State.DeliveryState;

public class OrderedState implements DeliveryState {
    @Override
    public void Status() {
        System.out.println("Order State Running");
    }
}
