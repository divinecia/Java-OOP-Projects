
import java.util.Scanner;

public class VariableAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value:");
        int value = scanner.nextInt();
        int processedValue = value * 2;
        System.out.println("Processed value: " + processedValue);
        scanner.close();
    }
}
