package Lab3;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyList<E> implements List<E> {
    List list = new ArrayList<>();
    public static  final Lock lock = new ReentrantLock();

    @Override
    public int size() {
        int size = 0;
        lock.lock();
        size = list.size();
        lock.unlock();
        return  size;
    }

    @Override
    public boolean isEmpty() {
        boolean emptiness = true;
        lock.lock();
        emptiness = list.isEmpty();
        lock.unlock();
        return emptiness;
    }

    @Override
    public boolean contains(Object o) {
        boolean temp = false;
        lock.lock();
        temp = list.contains(o);
        lock.unlock();
        return  temp;
    }

    @Override
    public Iterator iterator() {
        return null;
    }


    @Override
    public Object[] toArray() {
        Object[] objects = new Object[]{};
        lock.lock();
        objects = list.toArray();
        lock.unlock();
        return objects;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object e) {
        boolean add_status = false;
        lock.lock();
        add_status = list.add(e);
        lock.unlock();
        return  add_status;
    }

    @Override
    public boolean remove(Object o) {
        boolean remove_status = false;
        lock.lock();
        remove_status = list.remove(o);
        lock.unlock();
        return  remove_status;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean contains_status = false;
        lock.lock();
        contains_status = list.containsAll(c);
        lock.unlock();
        return contains_status;
    }

    @Override
    public boolean addAll(Collection c) {
        boolean add_All = false;
        lock.lock();
        add_All = list.addAll(c);
        lock.unlock();
        return  add_All;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        boolean add_status = false;
        lock.lock();
        add_status = list.addAll(index,c);
        lock.unlock();
        return  add_status;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean removeAllStatus = false;
        lock.lock();
        removeAllStatus = list.removeAll(c);
        lock.unlock();
        return  removeAllStatus;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean status = false;
        lock.lock();
        status = list.retainAll(c);
        lock.unlock();
        return  status;
    }

    @Override
    public void clear() {
        lock.lock();
        list.clear();
        lock.unlock();
    }

    @Override
    public E get(int index) {
        E object = null;
        lock.lock();
        object = (E) list.get(index);
        lock.unlock();
        return  object;
    }

    @Override
    public Object set(int index, Object element) {
        Object object = null;
        lock.lock();
        object = list.set(index,element);
        lock.unlock();
        return  object;
    }

    @Override
    public void add(int index, Object element) {
        boolean status = false;
        lock.lock();
        list.add(index,element);
        lock.unlock();
    }

    @Override
    public E remove(int index) {
        Object object = null;
        boolean status = false;
        lock.lock();
        object = list.remove(index);
        lock.unlock();
        return  (E)object;
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        boolean status = false;
        lock.lock();
        index = list.lastIndexOf(o);
        lock.unlock();
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        lock.lock();
        index = list.lastIndexOf(o);
        lock.unlock();
        return  index;
    }

    @Override
    public ListIterator listIterator() {
        ListIterator listIt = null;
        boolean status = false;
        lock.lock();
        listIt = list.listIterator();
        lock.unlock();
        return listIt;
    }

    @Override
    public ListIterator listIterator(int index) {
        ListIterator listIt = null;
        boolean status = false;
        lock.lock();
        listIt = list.listIterator(index);
        lock.unlock();
        return listIt;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {

        List subList = null;
        lock.lock();
        subList = list.subList(fromIndex,toIndex);
        lock.unlock();
        return subList;
    }
}
