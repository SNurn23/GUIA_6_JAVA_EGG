package Lvl_Low;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = input.nextInt();

        System.out.println("Double the number " + n + " is: " + (2 * n));
        System.out.println("Triple the number " + n + " is: " + (3 * n));
        System.out.println("The square root of the number " + n + " is: " + Math.sqrt(n));

        input.close();
    }
}