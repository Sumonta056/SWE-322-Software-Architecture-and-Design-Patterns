package Learning_Design_Patterns.AbstractFactoryMethod;

import Learning_Design_Patterns.AbstractFactoryMethod.AbstractFactory.ObstacleFactory;
import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.Asteriods;
import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.EnemyShips;
import Learning_Design_Patterns.AbstractFactoryMethod.ConcreteFactory.AsteroidFactory;
import Learning_Design_Patterns.AbstractFactoryMethod.ConcreteFactory.EnemyFactory;

public class Client {
    public static void main(String[] args) {

        ObstacleFactory factory ;
        int Score = (int)(Math.random() * 0.5) + 2;
        int level = (int)(Math.random() * 2) + 1;

        if (level == 1 ) {
            factory = new AsteroidFactory();
            Asteriods obstacle = factory.createAsteriods(Score);
            obstacle.show();
        }
        else {
            factory = new EnemyFactory();
            EnemyShips obstacle  = factory.createEnemyShips(Score);
            obstacle.show();
        }
    }
}
