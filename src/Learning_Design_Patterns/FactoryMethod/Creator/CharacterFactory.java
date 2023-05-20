package Learning_Design_Patterns.FactoryMethod.Creator;

import Learning_Design_Patterns.FactoryMethod.Product.Character;

public abstract class CharacterFactory {
    public abstract Character getcharcter(int level);
}
