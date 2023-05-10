package HomeWorks.Task_4_Builder_Method.Answer;

public class Client {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .cheese(1).lettuce(1).meat(1).cheese(1).meat(1).cheese(1).lettuce(1).meat(1).cheese(1).build();

        System.out.println("Cheese : " + burger.numberOfCheese());
        System.out.println("Meat = " + burger.numberOfMeat());
        System.out.println("Lettuce = " + burger.numberOflettuce());
        System.out.println("Total Cost of Burger : " + burger.getCost());
    }
}
