//package Learning_Design_Patterns.SOLID.Dependency_Inversion_Principle_DIP;
//
//public class ShoppingMall {
//
//    private DebitCard debitCard;
//
//    public ShoppingMall(DebitCard debitCard) {
//        this.debitCard = debitCard;
//    }
//
//    public void doPayment(Object order, int amount){
//        debitCard.doTransaction(amount);
//    }
//
//    public static void main(String[] args) {
//        DebitCard debitCard=new DebitCard();
//        ShoppingMall shoppingMall=new ShoppingMall(debitCard);
//        shoppingMall.doPayment("some order",5000);
//    }
//}