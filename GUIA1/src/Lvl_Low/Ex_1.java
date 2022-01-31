package Lvl_Low;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = input.nextInt();
        System.out.println("The result of sum between " +n1 + " and " +n2 + " is: " + (n1 + n2));

        input.close();
    }
}