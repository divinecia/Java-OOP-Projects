
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in USD:");
        double amount = scanner.nextDouble();
        System.out.println("Choose the currency to convert to (EUR, GBP, INR):");
        String currency = scanner.next().toUpperCase();
        double convertedAmount;

        switch (currency) {
            case "EUR":
                convertedAmount = amount * 0.85;
                break;
            case "GBP":
                convertedAmount = amount * 0.75;
                break;
            case "INR":
                convertedAmount = amount * 74.50;
                break;
            default:
                convertedAmount = 0;
                break;
        }

        if (convertedAmount > 0) {
            System.out.println("Converted amount: " + convertedAmount + " " + currency);
        } else {
            System.out.println("Invalid currency selected.");
        }
        scanner.close();
    }
}
