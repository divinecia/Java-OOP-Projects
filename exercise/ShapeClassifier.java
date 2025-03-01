
import java.util.Scanner;

public class ShapeClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides of the shape:");
        int sides = scanner.nextInt();
        String shape;

        switch (sides) {
            case 3:
                shape = "Triangle";
                break;
            case 4:
                shape = "Quadrilateral";
                break;
            case 5:
                shape = "Pentagon";
                break;
            case 6:
                shape = "Hexagon";
                break;
            case 7:
                shape = "Heptagon";
                break;
            case 8:
                shape = "Octagon";
                break;
            default:
                shape = "Polygon with " + sides + " sides";
                break;
        }

        System.out.println("The shape is: " + shape);
        scanner.close();
    }
}
