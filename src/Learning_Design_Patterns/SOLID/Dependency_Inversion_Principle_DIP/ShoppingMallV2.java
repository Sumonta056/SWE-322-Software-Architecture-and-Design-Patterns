package Learning_Design_Patterns.SOLID.Dependency_Inversion_Principle_DIP;

public class ShoppingMallV2{

    private BankCard bankCard;

    public ShoppingMallV2(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPayment(Object order, int amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new CreditCard();
        ShoppingMallV2 shoppingMall1 = new ShoppingMallV2(bankCard);
        shoppingMall1.doPayment("do some order", 10000);
    }
}