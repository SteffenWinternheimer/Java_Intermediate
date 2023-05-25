package mypackages.myset;
import java.util.Collection;
import java.util.HashSet;
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
    public Iterator iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public Object[] toArray(Object[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
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
    public boolean retainAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return mySet.removeAll(c);
    }

    @Override
    public void clear() {
        mySet.clear();
    }    
}
