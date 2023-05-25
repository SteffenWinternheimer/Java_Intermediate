package testing_area;
import mypackages.bag.Bag;


public class MyBag {
    public static void main(String[] args) {
        Bag<Integer> bag = new Bag<>();
        bag.addItem(2);
        bag.addItem(3);
        bag.addItem(2);
        System.out.println(bag.contains(null));
        bag.clear();
        bag.removeItem(null);
    }
}
