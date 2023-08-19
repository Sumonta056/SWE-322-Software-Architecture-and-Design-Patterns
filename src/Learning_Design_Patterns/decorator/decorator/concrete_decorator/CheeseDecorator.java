package Learning_Design_Patterns.decorator.decorator.concrete_decorator;

import Learning_Design_Patterns.decorator.component.Pizza;
import Learning_Design_Patterns.decorator.decorator.PizzaDecorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
