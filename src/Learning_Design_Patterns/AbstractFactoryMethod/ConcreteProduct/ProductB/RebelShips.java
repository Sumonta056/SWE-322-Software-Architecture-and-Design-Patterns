package Learning_Design_Patterns.AbstractFactoryMethod.ConcreteProduct.ProductB;


import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.EnemyShips;

public class RebelShips implements EnemyShips {
    @Override
    public void show() {
        System.out.println("Rebel Ships Appeared");
    }
}
