package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.concrete_product;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.product.Asteroids;

public class Rocky_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Rocky_Asteroids popped up");
    }
}
