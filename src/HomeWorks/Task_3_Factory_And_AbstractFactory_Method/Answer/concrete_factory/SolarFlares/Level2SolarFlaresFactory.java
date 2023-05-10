package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.SolarFlares;

import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Obstacle;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.SolarFlares.M_ClassFlares;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.SolarFlares.X_ClassFlares;

public class Level2SolarFlaresFactory extends SolarFlaresFactory {

    public Obstacle createObstacle(int score) {
        if(score > 1500) return new X_ClassFlares();
        else return new M_ClassFlares();
    }
}
