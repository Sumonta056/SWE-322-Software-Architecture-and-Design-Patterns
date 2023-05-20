package Learning_Design_Patterns.FactoryMethod.ConcreteProduct;

import Learning_Design_Patterns.FactoryMethod.Product.Character;

public class Warrior implements Character {
    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword!");
    }

    @Override
    public void defend() {
        System.out.println("Warrior defends with a shield!");
    }
}