import java.util.Scanner;

public class Sqare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for a: ");
        int a = sc.nextInt();
        System.out.println("Area: " + a * a);
        System.out.println("Perimeter: " + 4 * a );
        double b = a;
        double sqareRoot = Math.sqrt(b);
        System.out.println("Length of diagonal: " + a*sqareRoot);
        sc.close();
    }
}
