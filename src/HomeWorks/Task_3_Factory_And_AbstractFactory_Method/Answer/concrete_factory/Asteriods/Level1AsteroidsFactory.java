package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.Asteriods;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Asteriods.Asteriods;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Asteriods.Ice_Asteroids;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Asteriods.Iron_Asteroids;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Obstacle;

public class Level1AsteroidsFactory extends AsteriodsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return (Asteriods) new Iron_Asteroids();
    }
}
