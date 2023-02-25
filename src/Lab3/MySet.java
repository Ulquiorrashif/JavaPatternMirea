package Lab3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MySet implements Set {
    Set set ;

    public MySet(Collection s) {
        this.set = new TreeSet<>(s);
    }

    @Override
    synchronized public int size() {
        return set.size();
    }

    @Override
    synchronized public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    synchronized public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    synchronized public Iterator iterator() {
        return set.iterator();
    }

    @Override
    synchronized public Object[] toArray() {
        return set.toArray();
    }

    @Override
    synchronized public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
     synchronized public boolean add(Object o) {
        return set.add(o);
    }

    @Override
    synchronized public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    synchronized public boolean containsAll(Collection c) {
        return set.containsAll(c);
    }

    @Override
    synchronized public boolean addAll(Collection c) {
        return set.addAll(c);
    }

    @Override
    synchronized public void clear() {
        set.clear();

    }

    @Override
    synchronized public boolean removeAll(Collection c) {
        return set.removeAll(c);
    }

    @Override
    synchronized public boolean retainAll(Collection c) {
        return set.retainAll(c);
    }

}
