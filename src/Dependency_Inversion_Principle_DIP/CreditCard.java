package Dependency_Inversion_Principle_DIP;

public class CreditCard implements BankCard{

    public void doTransaction(int amount){
        System.out.println("Done with CreditCard");
    }
}