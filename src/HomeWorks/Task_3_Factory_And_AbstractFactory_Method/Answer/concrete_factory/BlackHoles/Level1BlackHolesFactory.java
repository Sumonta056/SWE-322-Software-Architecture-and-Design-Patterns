package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.BlackHoles;

import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.BlackHoles.Intermediate_BlackHoles;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.BlackHoles.Stella_BlackHoles;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Obstacle;

public class Level1BlackHolesFactory extends BlackHolesFactory{
    @Override
    public Obstacle createObstacle(int score) {
        if(score > 500) return new Stella_BlackHoles();
        else return new Intermediate_BlackHoles();
    }
}
