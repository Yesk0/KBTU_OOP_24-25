package lab3.problem5;

import java.util.Arrays;

public class testMain {
    public static void main(String[] args) {
        Chocolate[] chocolates = {
            new Chocolate("Twix", 50),
            new Chocolate("Mars", 60),
            new Chocolate("Snickers", 45)
        };
        Sort.bubbleSort(chocolates);
        System.out.println("Sorted chocolates: " + Arrays.toString(chocolates));

        Time[] times = {
            new Time(12, 30, 45),
            new Time(8, 15, 20),
            new Time(14, 5, 10)
        };
       
        Sort.bubbleSort(times);
        System.out.println("Sorted times: " + Arrays.toString(times));
    }
}

