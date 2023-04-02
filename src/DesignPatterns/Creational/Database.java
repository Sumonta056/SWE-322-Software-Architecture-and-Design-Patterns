package DesignPatterns.Creational;

public class Database {
    public static Database instance;
    private String username;

    private Database (String username) {
        // private constructor to prevent instantiation from outside the class
        this.username = username;

    }

    public static Database getInstance(String username) {
        if (instance == null) {
            instance = new Database(username);
        }
        return instance;
    }

    public  String getUserName(){
        return username;
    }


    // other methods and variables can go here
    public static void main(String[] args) {
        Database s1 = Database.getInstance("Mridul");
        System.out.println(s1.getUserName());

        Database s2 = Database.getInstance("Promi");
        System.out.println(s2.getUserName());
    }
}

