import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        double interestRate = sc.nextDouble();
        double interest = initialBalance * (interestRate / 100);
        double newBalance = initialBalance + interest;
        System.out.printf("Accrued interest: %.2f%n", interest);
        System.out.printf("New balance: %.2f%n", newBalance);

        sc.close();
    }
}

