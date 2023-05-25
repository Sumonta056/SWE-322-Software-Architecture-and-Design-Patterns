package Learning_Design_Patterns.IteratorDesignPattern.ConcreteIterator;

import Learning_Design_Patterns.IteratorDesignPattern.Iterator.Iterator;

// Step 3: NameIterator implementation of Iterator interface
public class NameIterator implements Iterator {
    private String[] names;
    private int position;

    public NameIterator(String[] names) {
        this.names = names;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < names.length;
    }

    public String next() {
        String name = names[position];
        position++;
        return name;
    }
}