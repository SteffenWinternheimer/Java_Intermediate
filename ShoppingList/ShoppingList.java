package Java_Intermediate.ShoppingList;

import java.util.ArrayList;

public class ShoppingList {
    ArrayList<String> shoppingList;

    public void createShoppingList() {
        shoppingList = new ArrayList<String>();
    }

    public void addItemToList(String item) {
        shoppingList.add(item);
    }

    public boolean removeItemFromList(String item) {
        return shoppingList.remove(item);
    }

    public String searchItemInList(String item) {
        for (String element : shoppingList) {
            if (element.equals(item))
                return element;
        }
        return null;
    }

    public void showShoppingList() {
        if (shoppingList.size() == 0) {
            System.out.println("Shopping list is empty!");
            return;
        }
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println("[" + i + "] " + shoppingList.get(i));
        }
    }

}
