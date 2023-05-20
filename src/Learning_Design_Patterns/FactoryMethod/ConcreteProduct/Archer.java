package Learning_Design_Patterns.FactoryMethod.ConcreteProduct;

import Learning_Design_Patterns.FactoryMethod.Product.Character;

public class Archer implements Character {
    @Override
    public void attack() {
        System.out.println("Archer attacks with a bow!");
    }

    @Override
    public void defend() {
        System.out.println("Archer defends with a dodge!");
    }
}