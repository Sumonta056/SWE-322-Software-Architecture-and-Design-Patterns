package Learning_Design_Patterns.MementoPattern;

// Originator
class Browser {
    private String currentPage;

    public void goToPage(String page) {
        System.out.println("Navigating to " + page);
        currentPage = page;
    }

    public Memento save() {
        return new Memento(currentPage);
    }

    public void restore(Memento memento) {
        currentPage = memento.getState();
        System.out.println("Restored to page: " + currentPage);
    }

    public String getCurrentPage() {
        return currentPage;
    }
}