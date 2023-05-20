package Learning_Design_Patterns.AbstractFactoryMethod.ConcreteProduct.ProductA;


import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.Asteriods;

public class Iron_Asteroids implements Asteriods {

    @Override
    public void show() {
        System.out.println("Iron_Asteroids popped up");
    }
}
