package DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
        Database s1 = Database.getInstance("Mridul");
        System.out.println(s1.getUserName());

        Database s2 = Database.getInstance("Promi");
        System.out.println(s2.getUserName());
    }
}
