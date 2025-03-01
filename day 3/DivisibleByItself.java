public class DivisibleByItself {
    public static void main(String[] args) {
        int number = 20;
        // System.out.println("Numbers between 1 and 20 that are divisible by themselves:");

        do {
            // A number is always divisible by itself
            System.out.println(number);
            number++;
        } while (number <= 100);
    }
}
