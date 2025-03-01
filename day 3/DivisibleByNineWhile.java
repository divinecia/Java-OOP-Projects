public class DivisibleByNineWhile {
    public static void main(String[] args) {
        int number = 15;
        // System.out.println("Numbers between 15 and 50 that are divisible by 9:");
        while (number <= 50) {
            if (number % 9 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
