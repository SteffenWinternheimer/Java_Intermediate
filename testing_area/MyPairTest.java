package testing_area;
import mypackages.pair.Pair;

public class MyPairTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String,Integer>("Alice", 25);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.toString());
    }
}
