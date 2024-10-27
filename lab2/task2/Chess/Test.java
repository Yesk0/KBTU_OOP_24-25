//package task2.Chess;
//
//public class Test
//{
//    public static void main(String[] args)
//    {
//        Position b_Rook = new Position("H1");
//        Rook rook = new Rook(b_Rook);
//
//        Position e_Rook = new Position("H6");
//
//        if (rook.isLegalMove(e_Rook))
//        {
//            System.out.println("Move is legal for Rook");
//        }
//        else
//        {
//            System.out.println("It isn't legal move for Rook");
//        }
//        Position b_Knight = new Position("C3");
//        Knight knight = new Knight(b_Knight);
//
//        Position e_Knight = new Position("E2");
//        if (knight.isLegalMove(e_Knight))
//        {
//            System.out.println("Move is legal for Knight");
//        }
//        else
//        {
//            System.out.println("It isn't legal move for Knight");
//        }
//    }
//}






package task2.Chess;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt for piece type
        System.out.print("Enter piece type (Rook/Knight): ");
        String pieceType = scanner.nextLine().trim();

        // Input starting position
        System.out.print("Enter starting position (e.g., H1): ");
        String startPosition = scanner.nextLine().trim();
        Position start = new Position(startPosition);

        // Input ending position
        System.out.print("Enter ending position (e.g., H6): ");
        String endPosition = scanner.nextLine().trim();
        Position end = new Position(endPosition);

        // Check move legality based on piece type
        if (pieceType.equalsIgnoreCase("Rook")) {
            Rook rook = new Rook(start);
            if (rook.isLegalMove(end)) {
                System.out.println("Move is legal for Rook");
            } else {
                System.out.println("It isn't a legal move for Rook");
            }
        } else if (pieceType.equalsIgnoreCase("Knight")) {
            Knight knight = new Knight(start);
            if (knight.isLegalMove(end)) {
                System.out.println("Move is legal for Knight");
            } else {
                System.out.println("It isn't a legal move for Knight");
            }
        } else {
            System.out.println("Invalid piece type. Please enter 'Rook' or 'Knight'.");
        }

        scanner.close();
    }
}
