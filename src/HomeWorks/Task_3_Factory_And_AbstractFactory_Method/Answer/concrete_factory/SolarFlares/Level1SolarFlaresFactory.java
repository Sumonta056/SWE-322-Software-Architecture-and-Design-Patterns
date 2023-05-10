package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.SolarFlares;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Obstacle;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.SolarFlares.A_ClassFlares;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.SolarFlares.B_ClassFlares;

public class Level1SolarFlaresFactory extends SolarFlaresFactory{
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new B_ClassFlares();
        else return new A_ClassFlares();
    }
}
