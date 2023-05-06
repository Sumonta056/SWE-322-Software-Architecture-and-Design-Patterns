package DesignPatterns.factory_method;


import DesignPatterns.factory_method.concrete_factory.Level1AsteroidsFactory;
import DesignPatterns.factory_method.creator.AsteroidsFactory;
import DesignPatterns.factory_method.product.Asteroids;

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
