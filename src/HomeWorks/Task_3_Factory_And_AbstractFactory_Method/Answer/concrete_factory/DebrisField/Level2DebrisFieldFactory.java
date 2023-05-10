package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.DebrisField;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.DebrisField.PersistentDebrisField;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.DebrisField.StaticDebrisField;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Obstacle;

public class Level2DebrisFieldFactory extends DebrisFieldFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new PersistentDebrisField();
        else return new StaticDebrisField();
    }
}
