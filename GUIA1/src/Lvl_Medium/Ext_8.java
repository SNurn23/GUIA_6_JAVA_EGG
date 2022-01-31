package Lvl_Medium;

import java.util.Scanner;

public class Ext_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        readNumbers(input);

        input.close();
    }

    public static void readNumbers(Scanner input) {
        int contE = 0, contOdd = 0, cont = 0;

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        while (num > 0) {
            if (num % 5 == 0) {
                break;
            } else {
                if (num % 2 == 0) {
                    contE++;
                } else {
                    contOdd++;
                }
            }
            cont++;
            System.out.println("Enter another number: ");
            num = input.nextInt();
        }

        System.out.println("the amount of even numbers  is: " + contE);
        System.out.println("the amount of odd numbers is: " + contOdd);
        System.out.println("the amount of numbers entered is: " + cont);
    }
}