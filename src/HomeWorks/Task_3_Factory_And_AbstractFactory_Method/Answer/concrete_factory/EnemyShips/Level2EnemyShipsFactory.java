package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.EnemyShips;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Asteriods.Asteriods;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.EnemyShips.EnemyShips;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.EnemyShips.RebelShips;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.EnemyShips.ZoltanShips;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Obstacle;

public class Level2EnemyShipsFactory extends EnemyShipsFactory{
    @Override
    public Obstacle createObstacle(int score) {
        if(score > 500) return new RebelShips();
        else return new ZoltanShips();
    }
}
