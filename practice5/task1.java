package practice5;
public class task1
{
    public static void main(String[] args)
    {
        int     denominator, numerator, ratio;


        numerator   = 5;
        denominator = 0;

        try {
            ratio = numerator / denominator;
        }
        catch (ArithmeticException e) {
            System.err.println("Can't do division by zero. Check value of your denominator.");
            ratio = 0;

            e.printStackTrace();
        }
        System.out.println("The answer is: "+ratio);

        System.out.println("Done."); // Don't move this line
    }
}




/*
A1
1. Compiled
2. Output is 2
3. Changed (row 13)
4. Program caught exception, division by 0
5. Added
6. java: variable ratio might not have been initialized
7. Added (Output was 0)

*/