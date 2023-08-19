package Learning_Design_Patterns.decorator.decorator.concrete_decorator;

import Learning_Design_Patterns.decorator.component.Pizza;
import Learning_Design_Patterns.decorator.decorator.PizzaDecorator;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
