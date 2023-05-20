package Learning_Design_Patterns.FactoryMethod.ConcreteCreator;

import Learning_Design_Patterns.FactoryMethod.Creator.CharacterFactory;
import Learning_Design_Patterns.FactoryMethod.ConcreteProduct.Archer;
import Learning_Design_Patterns.FactoryMethod.Product.Character;
import Learning_Design_Patterns.FactoryMethod.ConcreteProduct.Warrior;
import Learning_Design_Patterns.FactoryMethod.ConcreteProduct.Wizard;

public class CharacterFactoryConcrete extends CharacterFactory {
    @Override
    public Character getcharcter(int level) {
        if (level == 1) {
            return new Warrior();
        }
        else if(level == 2) {
            return new Wizard();
        }
        else {
            return new Archer();
        }
    }
}
