package Learning_Design_Patterns.FactoryMethod.ConcreteProduct;

import Learning_Design_Patterns.FactoryMethod.Product.Character;

public class Wizard implements Character {
    @Override
    public void attack() {
        System.out.println("Wizard attacks with magic!");
    }

    @Override
    public void defend() {
        System.out.println("Wizard defends with a spell!");
    }
}