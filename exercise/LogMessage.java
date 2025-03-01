// Provided in previous messages
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LogMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scanner.next();
        System.out.println("Enter the action taken:");
        String action = scanner.next();

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);

        String logMessage = "Timestamp: " + timestamp + ", Username: " + username + ", Action: " + action;
        System.out.println("Log message: " + logMessage);
        scanner.close();
    }
}
