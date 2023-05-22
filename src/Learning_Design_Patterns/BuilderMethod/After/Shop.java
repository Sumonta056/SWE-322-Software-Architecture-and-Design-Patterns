package Learning_Design_Patterns.BuilderMethod.After;


public class Shop {
    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOs("Android")
                .setBattery(4000).setRam(16).getPhone();

        System.out.println(p);
    }
}
