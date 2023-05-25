package mypackages.bag;

import java.util.ArrayList;
import java.util.List;

public class Bag<T>{
    List<T> bag;

    public Bag(){
        bag = new ArrayList<>();
    }

    public void addItem(T item){
        bag.add(item);
    }

    public boolean contains(T item){
        return bag.contains(item);
    }

    public boolean removeItem(T item){
        return bag.remove(item);
    }

    public int size(){
        return bag.size();
    }

    public void clear(){
        bag.clear();
    }
    
}


