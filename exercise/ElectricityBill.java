
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your electricity usage in units:");
        int units = scanner.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = units * 0.50;
        } else if (units <= 300) {
            bill = 100 * 0.50 + (units - 100) * 0.75;
        } else {
            bill = 100 * 0.50 + 200 * 0.75 + (units - 300) * 1.20;
        }
        System.out.println("Your electricity bill is: $" + bill);
        scanner.close();
    }
}
