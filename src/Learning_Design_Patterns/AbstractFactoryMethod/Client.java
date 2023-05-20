package Learning_Design_Patterns.AbstractFactoryMethod;

import Learning_Design_Patterns.AbstractFactoryMethod.AbstractFactory.ObstacleFactory;
import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.Asteriods;
import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.EnemyShips;
import Learning_Design_Patterns.AbstractFactoryMethod.ConcreteFactory.AsteroidFactory;
import Learning_Design_Patterns.AbstractFactoryMethod.ConcreteFactory.EnemyFactory;

public class Client {
    public static void main(String[] args) {

        ObstacleFactory factory ;
        int Score = 400 ;
        int level = 0 ;

        if (level == 1 ) factory = new AsteroidFactory();
        else factory = new EnemyFactory();

        Asteriods obstacle1 = factory.createAsteriods(Score);
        EnemyShips obstacle2  = factory.createEnemyShips(Score);

        if (level == 1 ) obstacle1.show();
        else obstacle2.show();
    }
}
