
import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your income:");
        double income = scanner.nextDouble();
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        System.out.println("Enter your existing loans amount:");
        double existingLoans = scanner.nextDouble();

        boolean eligible = income > 30000 && creditScore > 650 && existingLoans < (0.4 * income);

        if (eligible) {
            System.out.println("You are eligible for a loan.");
        } else {
            System.out.println("You are not eligible for a loan.");
        }
        scanner.close();
    }
}