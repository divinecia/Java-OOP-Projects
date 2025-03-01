// Provided in previous messages

import java.util.Scanner;

public class StringEncoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to encode:");
        String input = scanner.nextLine();
        StringBuilder encodedString = new StringBuilder();

        for (char c : input.toCharArray()) {
            encodedString.append((int) c).append(" ");
        }
        System.out.println("Encoded string: " + encodedString.toString().trim());
        scanner.close();
    }
}
