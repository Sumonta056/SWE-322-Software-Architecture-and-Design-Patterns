package Learning_Design_Patterns.MementoPattern;

public class Client {
    public static void main(String[] args) {
        Browser browser = new Browser();
        BrowserHistory history = new BrowserHistory();

        browser.goToPage("www.example.com");
        history.save(browser.save());

        browser.goToPage("www.openai.com");
        history.save(browser.save());

        System.out.println("Current page: " + browser.getCurrentPage()); // Output: www.openai.com

        browser.restore(history.undo());
        System.out.println("Current page: " + browser.getCurrentPage()); // Output: www.example.com

        browser.restore(history.redo());
        System.out.println("Current page: " + browser.getCurrentPage()); // Output: www.openai.com
    }
}
