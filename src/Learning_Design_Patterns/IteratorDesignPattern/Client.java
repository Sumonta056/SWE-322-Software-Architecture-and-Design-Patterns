package Learning_Design_Patterns.IteratorDesignPattern;

import Learning_Design_Patterns.IteratorDesignPattern.ConreteCollection.NameCollection;
import Learning_Design_Patterns.IteratorDesignPattern.IterableCollection.Collection;
import Learning_Design_Patterns.IteratorDesignPattern.Iterator.Iterator;

public class Client {
    public static void main(String[] args) {
        String[] names = {"John", "Emily", "David", "Sarah"};

        Collection collection = new NameCollection(names);
        Iterator iterator = collection.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
