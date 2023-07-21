package Learning_Design_Patterns.MementoPattern;

import java.util.ArrayList;
import java.util.List;


// Caretaker
class BrowserHistory {
    private List<Memento> history = new ArrayList<>();
    private int currentIndex = -1;

    public void save(Memento memento) {
        history.add(memento);
        currentIndex = history.size() - 1;
    }

    public Memento undo() {
        if (currentIndex > 0) {
            currentIndex--;
            return history.get(currentIndex);
        }
        return null;
    }

    public Memento redo() {
        if (currentIndex < history.size() - 1) {
            currentIndex++;
            return history.get(currentIndex);
        }
        return null;
    }
}