import java.util.Scanner;

public class PersonalizedURL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scanner.next();
        String url = "www." + username + ".com";
        System.out.println("Personalized URL: " + url);
        scanner.close();
    }
}

