
import java.util.Scanner;

public class FullNameFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split(" ");
        String formattedName = nameParts[nameParts.length - 1] + ", " + nameParts[0];
        System.out.println("Formatted name: " + formattedName);
        scanner.close();
    }
}
