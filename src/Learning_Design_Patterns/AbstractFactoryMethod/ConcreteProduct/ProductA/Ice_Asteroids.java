package Learning_Design_Patterns.AbstractFactoryMethod.ConcreteProduct.ProductA;


import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.Asteriods;

public class Ice_Asteroids implements Asteriods {

    @Override
    public void show() {
        System.out.println("Ice_Asteroids popped up");
    }
}
