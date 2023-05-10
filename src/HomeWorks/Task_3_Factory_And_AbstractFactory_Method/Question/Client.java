package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.concrete_creator.Level1AsteroidsFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.concrete_creator.Level2AsteroidsFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.creator.AsteroidsFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.product.Asteroids;

public class Client {
    public static void main(String[] args) {
        int level = (int)(Math.random() * 2) + 1;

        AsteroidsFactory asteroidsFactory;

        if(level == 1) asteroidsFactory = new Level1AsteroidsFactory();
        else asteroidsFactory = new Level2AsteroidsFactory();

        int score = (int)(Math.random() * 2000);

        Asteroids asteroids = asteroidsFactory.createAsteroids(score);
        asteroids.show();
    }
}
