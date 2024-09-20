import java.util.Scanner;

public class PrintMyName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("+---+");
        System.out.println("|"+name+"|");
        System.out.println("+---+");
        scanner.close();
    }
}