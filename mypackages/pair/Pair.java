package mypackages.pair;

public class Pair<K,V> {
    K first;
    V second;
    public Pair(K first, V second){
        this.first = first;
        this.second = second;
    }

    public K getFirst(){
        return first;
    }

    public V getSecond(){
        return second;
    }

    public String toString(){
        return first + " : " + second;
    }
}

