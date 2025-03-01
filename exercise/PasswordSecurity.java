
import java.util.Scanner;

public class PasswordSecurity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = scanner.next();

        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasSpecialChar = password.matches(".*[^a-zA-Z0-9].*");
        boolean isLongEnough = password.length() >= 8;

        if (hasNumber && hasUppercase && hasSpecialChar && isLongEnough) {
            System.out.println("Password meets security standards.");
        } else {
            System.out.println("Password does not meet security standards.");
        }
        scanner.close();
    }
}
