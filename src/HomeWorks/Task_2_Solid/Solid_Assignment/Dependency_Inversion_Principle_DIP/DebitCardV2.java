package HomeWorks.Task_2_Solid.Solid_Assignment.Dependency_Inversion_Principle_DIP;

public class DebitCardV2 implements BankCard {

    public void doTransaction(int amount){
        System.out.println("Done with DebitCard");
    }
}