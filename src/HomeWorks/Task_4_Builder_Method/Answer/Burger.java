package HomeWorks.Task_4_Builder_Method.Answer;

public class Burger {
    private final double cost;
    private final int cheese;
    private final int meat;
    private final int lettuce;

    private Burger(BurgerBuilder builder) {
        this.cost = builder.getCost();
        this.cheese = builder.cheese;
        this.meat = builder.meat;
        this.lettuce = builder.lettuce;
    }

    public double getCost() {
        return cost;
    }

    public int numberOfCheese() {
        return cheese;
    }

    public int numberOfMeat() {
        return meat;
    }

    public int numberOflettuce() {
        return lettuce;
    }

    public static class BurgerBuilder {

        private int cheese = 0;
        private int meat = 0;
        private int lettuce = 0;
        private final int cheesePrice = 10;
        private final int meatPrice = 10;
        private final int lettucePrice = 10;

        public BurgerBuilder(){}

        public double getCost(){
            return cheese * cheesePrice + meat * meatPrice + lettuce * lettucePrice;
        }

        public BurgerBuilder cheese(int cheese) {
            this.cheese += cheese;
            return this;
        }

        public BurgerBuilder lettuce(int lettuce) {
            this.lettuce += lettuce;
            return this;
        }

        public BurgerBuilder meat(int meat) {
            this.meat += meat;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}