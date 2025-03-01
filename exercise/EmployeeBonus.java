
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        System.out.println("Enter your years of service:");
        int years = scanner.nextInt();

        double bonus = 0;
        if (years < 5) {
            bonus = 0.05 * salary;
        } else if (years <= 10) {
            bonus = 0.10 * salary;
        } else {
            bonus = 0.15 * salary;
        }
        System.out.println("Your bonus is: " + bonus);
        scanner.close();
    }
}
