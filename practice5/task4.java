package practice5;
import java.util.*;

public class task4 {
    public static void main(String[] args) {

        double leftOperand = 0, result, rightOperand = 0;
        String leftString = "", operator = "", rightString, delim = "";
        StringTokenizer tokenizer;


        System.out.println("Enter expression: ");
        System.out.println("Or \"0\" to exit.");

        Scanner in = new Scanner(System.in);

        while (true) {

            String txt = in.nextLine();

            if (txt.equals("0")) {
                in.close();
                System.exit(0);
            }

            if (txt.contains("+")) delim = "+";
            else if (txt.contains("-")) delim = "-";
            else if (txt.contains("*")) delim = "*";
            else if (txt.contains("/")) delim = "/";

            tokenizer = new StringTokenizer(txt, delim, true);


            try {
                leftString = tokenizer.nextToken();
                operator = tokenizer.nextToken();
                rightString = tokenizer.nextToken();

                try {
                    leftOperand = Double.parseDouble(leftString);
                } catch (NumberFormatException nfe) {
                    System.err.println("Left operand is not a number.");
                } finally {
                    try {
                        rightOperand = Double.parseDouble(rightString);
                    } catch (NumberFormatException nfe) {
                        System.err.println("Right operand is not a number.");
                    }
                }

                result = 0.0;

                switch (operator) {
                    case "+":
                        result = leftOperand + rightOperand;
                        break;
                    case "-":
                        result = leftOperand - rightOperand;
                        break;
                    case "*":
                        result = leftOperand * rightOperand;
                        break;
                    case "/":
                        if (rightOperand != 0) {
                            result = leftOperand / rightOperand;
                        } else {
                            System.err.println("Right operand is \"zero\", choose other option or right operand.");
                            return;
                        }
                        break;
                }
                System.out.println("Result: " + result);
            } catch (NoSuchElementException nsee) {
                System.err.println("Invalid syntax");
            }
        }
    }
}





/*

1. "Result: 14.5"
2. "Invalid Syntax"
3. NoSuchElementException is thrown
4. "One or more operands is not a number"
5. NumberFormatException is thrown

*/