package Lvl_Medium;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;

        for (int i = 0; i < 4; i++) {
            do {
                System.out.println("Enter a number between 1 and 20: ");
                n = input.nextInt();
            } while (n < 1 || n > 20);

            System.out.print(n + ": ");

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        input.close();
    }
}
