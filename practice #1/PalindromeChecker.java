import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = cleanedStr.length() - 1;
        while (start < end) {
            if (cleanedStr.charAt(start) != cleanedStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку для проверки: ");
        String input = sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
        sc.close();
    }
}
