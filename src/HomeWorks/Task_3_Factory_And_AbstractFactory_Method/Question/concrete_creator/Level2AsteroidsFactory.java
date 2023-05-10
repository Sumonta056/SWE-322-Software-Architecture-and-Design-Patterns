package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.concrete_creator;

import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.concrete_product.Rocky_Asteroids;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.concrete_product.Silicon_Asteroids;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.creator.AsteroidsFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.product.Asteroids;


public class Level2AsteroidsFactory extends AsteroidsFactory {
    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
}
