package Learning_Design_Patterns.FactoryMethod.Client;

import Learning_Design_Patterns.FactoryMethod.ConcreteCreator.CharacterFactoryConcrete;
import Learning_Design_Patterns.FactoryMethod.Creator.CharacterFactory;
import Learning_Design_Patterns.FactoryMethod.Product.Character;


public class Game {

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactoryConcrete();
        Character character = factory.getcharcter(2);
        character.attack();
    }

}
