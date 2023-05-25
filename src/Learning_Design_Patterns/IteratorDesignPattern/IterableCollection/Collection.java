package Learning_Design_Patterns.IteratorDesignPattern.IterableCollection;

import Learning_Design_Patterns.IteratorDesignPattern.Iterator.Iterator;

// Step 2: Collection interface
public interface Collection {
    Iterator getIterator();
}
