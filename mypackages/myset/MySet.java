package mypackages.myset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;


public class MySet<T> implements Set<T>{

    public List<T> mySet;

    public MySet(){
        mySet = new ArrayList<>();
    }


    @Override
    public int size() {
        return mySet.size();
    }

    @Override
    public boolean isEmpty() {
        return mySet.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return mySet.contains(o);
    }
    

    @Override
    public boolean add(T e) {
        return mySet.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return mySet.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return mySet.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return mySet.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return mySet.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return mySet.removeAll(c);
    }

    @Override
    public void clear() {
        mySet.clear();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return mySet.toArray(a);
    }


    @Override
    public Iterator<T> iterator() {
        return mySet.iterator();
    }


    @Override
    public Object[] toArray() {
        return mySet.toArray();
    }    
}
