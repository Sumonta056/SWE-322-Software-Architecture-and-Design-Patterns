package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.BlackHoles;

import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.BlackHoles.Massive_BlackHoles;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.BlackHoles.SuperMassive_BlackHoles;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Obstacle;

public class Level2BlackHolesFactory extends BlackHolesFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if (score > 500) return new Massive_BlackHoles();
        else return new SuperMassive_BlackHoles();
    }
}