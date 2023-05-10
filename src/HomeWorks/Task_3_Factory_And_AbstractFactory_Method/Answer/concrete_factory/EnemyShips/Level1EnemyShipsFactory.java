package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.EnemyShips;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.EnemyShips.FederationShips;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.EnemyShips.MantisShips;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Obstacle;

public class Level1EnemyShipsFactory extends EnemyShipsFactory{
    @Override
    public Obstacle createObstacle(int score) {
        if(score > 500) return new FederationShips();
        else return new MantisShips();
    }
}
