
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customer category (Regular, Premium, VIP):");
        String category = scanner.next().toLowerCase();
        System.out.println("Enter the purchase amount:");
        double amount = scanner.nextDouble();
        double discount;

        switch (category) {
            case "regular":
                discount = amount * 0.05;
                break;
            case "premium":
                discount = amount * 0.10;
                break;
            case "vip":
                discount = amount * 0.20;
                break;
            default:
                discount = 0;
                break;
        }

        System.out.println("The discount is: $" + discount);
        System.out.println("The final amount to be paid is: $" + (amount - discount));
        scanner.close();
    }
}