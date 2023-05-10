package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.creator;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.product.Asteroids;

public abstract class AsteroidsFactory {
    public abstract Asteroids createAsteroids(int score);
}
