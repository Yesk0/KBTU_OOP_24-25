package lab3.porblem3;

import java.util.Iterator;

public interface MyCollection<T> {

    boolean add(T element);

    boolean remove(T element);

    boolean contains(T element);

    int size();

    boolean isEmpty();

    void clear();

    Iterator<T> iterator();
}
