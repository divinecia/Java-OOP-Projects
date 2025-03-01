
import java.util.Scanner;

public class OperatingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the operating system:");
        String os = scanner.next().toLowerCase();

        switch (os) {
            case "windows":
                System.out.println("The operating system is Windows.");
                break;
            case "macos":
                System.out.println("The operating system is macOS.");
                break;
            case "linux":
                System.out.println("The operating system is Linux.");
                break;
            default:
                System.out.println("Unknown operating system.");
                break;
        }
        scanner.close();
    }
}
