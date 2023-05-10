package Java_Intermediate.Testing;

import java.util.Scanner;
import Java_Intermediate.ShoppingList.ShoppingList;

public class ShoppingListTest {
    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.createShoppingList();
        Scanner scanner = new Scanner(System.in);
        boolean isProgramActive = true;
        int input;
        while (isProgramActive) {
            System.out.println("Welcome to your personal shopping list! What can i do for you?");
            System.out.println("[1]: Add item to shopping list");
            System.out.println("[2]: Remove item from shopping list");
            System.out.println("[3]: Show shopping list");
            System.out.println("[4]: Exit program");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    addItem(shoppingList);
                    break;
                case 2:
                    removeItem(shoppingList);
                    break;
                case 3:
                    shoppingList.showShoppingList();
                    break;
                case 4:
                    isProgramActive = false;
                    break;
                default:
                    System.out.println("Input not allowed! Try again!");
                    break;
            }
            input = 1;
        }
        scanner.close();
        System.out.println("See you soon!");
    }

    private static void removeItem(ShoppingList shoppingList) {
        Scanner itemScanner = new Scanner(System.in);
        System.out.println("Which item do you want to add?");
        try {
            String item = itemScanner.nextLine();
            if (shoppingList.removeItemFromList(item)) {
                System.out.println("Item " + item + " has been removed to shopping list!");
            } else {
                System.out.println("Item not found. Nothing has been removed!");
            }
        } catch (ClassCastException ex) {
            System.out.println("Item not viable! Try again...");
        }
    }

    private static void addItem(ShoppingList shoppingList) {
        Scanner itemScanner = new Scanner(System.in);
        System.out.println("Which item do you want to add?");
        try {
            String item = itemScanner.nextLine();
            shoppingList.addItemToList(item);
            System.out.println("Item " + item + " has been added to shopping list!");
        } catch (ClassCastException ex) {
            System.out.println("Item not viable! Try again...");
        }
    }
}
