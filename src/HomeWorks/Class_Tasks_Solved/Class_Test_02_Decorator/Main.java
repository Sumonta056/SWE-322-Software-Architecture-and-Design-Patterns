package HomeWorks.ClassTasks.Class_Test_02_Decorator;

public class Main {
    public static void main(String[] args) {
        Clothing basicClothing = new BasicClothing();
        Clothing jacket = new Jacket(basicClothing);
        Clothing hatAndJacket = new Hat(jacket);

        hatAndJacket.wear();
    }
}