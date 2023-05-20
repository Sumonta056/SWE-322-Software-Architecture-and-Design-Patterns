package Learning_Design_Patterns.AbstractFactoryMethod.ConcreteProduct.ProductB;


import Learning_Design_Patterns.AbstractFactoryMethod.AbstractProduct.EnemyShips;

public class FederationShips implements EnemyShips {
    @Override
    public void show() {
        System.out.println("Federation Ships Appeared");
    }
}
