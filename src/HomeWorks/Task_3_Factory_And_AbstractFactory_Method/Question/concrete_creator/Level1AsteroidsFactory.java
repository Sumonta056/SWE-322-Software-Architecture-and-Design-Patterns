package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.concrete_creator;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.concrete_product.Ice_Asteroids;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.concrete_product.Iron_Asteroids;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.creator.AsteroidsFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.product.Asteroids;

public class Level1AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
}
