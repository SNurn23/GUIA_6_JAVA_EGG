package Lvl_High;

import java.util.Scanner;

public class Ext_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        countDigits(n);

        input.close();
    }

    public static void countDigits(int n) {
        int cont = 0, num = n;

        while (n > 0) {
            n /= 10;
            cont++;
        }

        System.out.println("The number " + num + " have " + cont + " digits");
    }
}
