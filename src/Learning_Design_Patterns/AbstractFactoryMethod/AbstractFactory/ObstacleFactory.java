package Learning_Design_Patterns.AbstractFactoryMethod.AbstractFactory;


import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.Asteriods;
import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.EnemyShips;

public abstract class ObstacleFactory {
    public abstract Asteriods createAsteriods(int score);
    public abstract EnemyShips createEnemyShips(int score);
}
