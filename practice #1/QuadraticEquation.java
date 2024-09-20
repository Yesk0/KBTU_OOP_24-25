import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = sc.nextDouble();
        double D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("Error: the discriminant is negative. There are no roots.");
        }
        else {
            double sqrtD = Math.sqrt(D);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            // Проверка на наличие одного или двух корней
            if (D == 0) {
                System.out.println("The root of the equation is one: x = " + x1);
            } else {
                System.out.println("The roots of the equation are: x1 = " + x1 + ", x2 = " + x2);
            }
        }

        sc.close();
    }
}

