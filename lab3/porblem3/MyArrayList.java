package lab3.porblem3;

import java.util.ArrayList;
import java.util.Iterator;


public class MyArrayList<T> implements MyCollection<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public boolean add(T element) {
        return list.add(element);
    }

    @Override
    public boolean remove(T element) {
        return list.remove(element);
    }

    @Override
    public boolean contains(T element) {
        return list.contains(element);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
