package DesignPatterns.factory_method.concrete_factory;


import DesignPatterns.factory_method.concrete_product.Iron_Asteroids;
import DesignPatterns.factory_method.creator.AsteroidsFactory;
import DesignPatterns.factory_method.product.Asteroids;

public class Level1AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
}
