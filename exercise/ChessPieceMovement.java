import java.util.Scanner;

public class ChessPieceMovement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the chess piece (King, Queen, Rook, Bishop, Knight, Pawn):");
        String piece = scanner.next().toLowerCase();

        switch (piece) {
            case "king":
                System.out.println("The King can move one square in any direction.");
                break;
            case "queen":
                System.out.println("The Queen can move any number of squares in any direction.");
                break;
            case "rook":
                System.out.println("The Rook can move any number of squares horizontally or vertically.");
                break;
            case "bishop":
                System.out.println("The Bishop can move any number of squares diagonally.");
                break;
            case "knight":
                System.out.println(
                        "The Knight moves in an L-shape: two squares in one direction and then one square perpendicular.");
                break;
            case "pawn":
                System.out.println(
                        "The Pawn moves one square forward, but captures diagonally. On its first move, it can move two squares forward.");
                break;
            default:
                System.out.println("Invalid chess piece.");
                break;
        }
        scanner.close();
    }
}
