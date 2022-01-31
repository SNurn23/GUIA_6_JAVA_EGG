package Lvl_Medium;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a positive limit");
        int limit = input.nextInt();

        int sum = 0;

        do {
            System.out.println("Enter a number");
            sum += input.nextInt();
        } while (sum <= limit);

        System.out.println("Result of the calculation: " + sum);

        input.close();
    }
}
