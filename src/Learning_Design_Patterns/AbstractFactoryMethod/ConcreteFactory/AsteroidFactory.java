package Learning_Design_Patterns.AbstractFactoryMethod.ConcreteFactory;


import Learning_Design_Patterns.AbstractFactoryMethod.AbstractFactory.ObstacleFactory;
import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.Asteriods;
import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.EnemyShips;
import Learning_Design_Patterns.AbstractFactoryMethod.ConcreteProduct.ProductA.Ice_Asteroids;
import Learning_Design_Patterns.AbstractFactoryMethod.ConcreteProduct.ProductA.Iron_Asteroids;

public class AsteroidFactory extends ObstacleFactory {

    @Override
    public Asteriods createAsteriods(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return  new Iron_Asteroids();
    }

    @Override
    public EnemyShips createEnemyShips(int score) {
        return null;
    }
}
