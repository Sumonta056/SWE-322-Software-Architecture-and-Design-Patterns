package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.concrete_product;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.product.Asteroids;

public class Ice_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Ice_Asteroids popped up");
    }
}
