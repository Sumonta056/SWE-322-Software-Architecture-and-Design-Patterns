package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.concrete_product;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Question.product.Asteroids;

public class Iron_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Iron_Asteroids popped up");
    }
}
