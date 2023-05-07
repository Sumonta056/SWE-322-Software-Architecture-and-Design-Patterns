package Learning_Design_Patterns.SOLID.Liskov_substitution_Principle_LSP;

public class BankServiceWithoutSRP {

    public void login(String userName , String password){
        // authenticate user
    }

    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    public long withDraw(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }
}
