package Learning_Design_Patterns.AbstractFactoryMethod.ConcreteFactory;

import Learning_Design_Patterns.AbstractFactoryMethod.AbstractFactory.ObstacleFactory;
import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.Asteriods;
import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.EnemyShips;

import Learning_Design_Patterns.AbstractFactoryMethod.ConcreteProduct.ProductB.FederationShips;
import Learning_Design_Patterns.AbstractFactoryMethod.ConcreteProduct.ProductB.RebelShips;

public class EnemyFactory extends ObstacleFactory {
    @Override
    public Asteriods createAsteriods(int score) {
        return null;
    }

    @Override
    public EnemyShips createEnemyShips(int score) {
        if(score > 500) return new FederationShips();
        else return  new RebelShips();
    }
}
