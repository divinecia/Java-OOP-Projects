import java.util.Scanner;

public class TimeGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time (0-23):");
        int time = scanner.nextInt();

        if (time >= 0 && time <= 5) {
            System.out.println("Good Night");
        } else if (time >= 6 && time <= 11) {
            System.out.println("Good Morning");
        } else if (time >= 12 && time <= 17) {
            System.out.println("Good Afternoon");
        } else if (time >= 18 && time <= 23) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Invalid time entered.");
        }
        scanner.close();
    }
}