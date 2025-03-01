
import java.util.Scanner;

public class MenuItemPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the menu item (Burger, Pizza, Salad):");
        String menuItem = scanner.next().toLowerCase();
        double price;

        switch (menuItem) {
            case "burger":
                price = 5.99;
                break;
            case "pizza":
                price = 8.99;
                break;
            case "salad":
                price = 4.99;
                break;
            default:
                price = 0;
                break;
        }

        if (price > 0) {
            System.out.println("The price of " + menuItem + " is $" + price);
        } else {
            System.out.println("Invalid menu item.");
        }
        scanner.close();
    }
}
