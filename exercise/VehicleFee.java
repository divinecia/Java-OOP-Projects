
import java.util.Scanner;

public class VehicleFee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of vehicle (Car, Truck, Motorcycle, Bus):");
        String vehicle = scanner.next().toLowerCase();
        double fee;

        switch (vehicle) {
            case "car":
                fee = 5.00;
                break;
            case "truck":
                fee = 10.00;
                break;
            case "motorcycle":
                fee = 2.00;
                break;
            case "bus":
                fee = 8.00;
                break;
            default:
                fee = 0;
                break;
        }

        if (fee > 0) {
            System.out.println("The fee for the " + vehicle + " is $" + fee);
        } else {
            System.out.println("Invalid vehicle type.");
        }
        scanner.close();
    }
}
