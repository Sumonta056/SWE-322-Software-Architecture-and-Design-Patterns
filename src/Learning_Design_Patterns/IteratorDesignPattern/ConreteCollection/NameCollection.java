package Learning_Design_Patterns.IteratorDesignPattern.ConreteCollection;

import Learning_Design_Patterns.IteratorDesignPattern.ConcreteIterator.NameIterator;
import Learning_Design_Patterns.IteratorDesignPattern.IterableCollection.Collection;
import Learning_Design_Patterns.IteratorDesignPattern.Iterator.Iterator;

// Step 4: NameCollection implementation of Collection interface
public class NameCollection implements Collection {
    private String[] names;
    public NameCollection(String[] names) {
        this.names = names;
    }
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}