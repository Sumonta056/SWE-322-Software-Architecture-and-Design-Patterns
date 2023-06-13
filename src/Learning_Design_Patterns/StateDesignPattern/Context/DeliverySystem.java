package Learning_Design_Patterns.StateDesignPattern.Context;

import Learning_Design_Patterns.StateDesignPattern.ConcreteStates.OrderedState;
import Learning_Design_Patterns.StateDesignPattern.State.DeliveryState;

public class DeliverySystem {
    private DeliveryState state;

    public DeliverySystem() {
        this.state = new OrderedState();
        // Initially on Ordered State
    }

    public void setState(DeliveryState state) {
        this.state = state;
    }

    public void status() {
        state.Status();
    }

}
