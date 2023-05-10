package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.abstract_factory;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Obstacle;

public abstract class ObstacleFactory {
    public abstract Obstacle createObstacle(int score);
}
