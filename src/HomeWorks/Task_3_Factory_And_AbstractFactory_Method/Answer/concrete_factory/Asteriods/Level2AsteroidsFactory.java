package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.Asteriods;

import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Asteriods.Rocky_Asteroids;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Asteriods.Silicon_Asteroids;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Obstacle;


public class Level2AsteroidsFactory extends AsteriodsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
}
