import java.util.Scanner;
import java.util.Locale;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter your number: ");
        float n = sc.nextFloat();
        System.out.print("It is your grade: ");
        if (n == 0) {
            System.out.println("F");
        }
        else if (n == 1.0) {
            System.out.println("D");
        }
        else if (Math.abs(n - 1.33) < 0.01) {
            System.out.println("D+");
        }
        else if (Math.abs(n - 1.67) < 0.01) {
            System.out.println("C-");
        }
        else if (n == 2.0) {
            System.out.println("C");
        }
        else if (Math.abs(n - 2.33) < 0.01) {
            System.out.println("C+");
        }
        else if (Math.abs(n - 2.67) < 0.01) {
            System.out.println("B-");
        }
        else if (n == 3.0) {
            System.out.println("B");
        }
        else if (Math.abs(n - 3.33) < 0.01) {
            System.out.println("B+");
        }
        else if (Math.abs(n - 3.67) < 0.01) {
            System.out.println("A-");
        }
        else if (n == 4.0) {
            System.out.println("A");
        }
        else {
            System.out.println("Invalid grade input.");
        }
        sc.close();
    }
}
