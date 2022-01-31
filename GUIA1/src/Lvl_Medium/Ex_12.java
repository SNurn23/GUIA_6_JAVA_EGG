package Lvl_Medium;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;

        do {
            System.out.println("Enter a note");
            n = input.nextInt();

            if (n >= 0 && n <= 10) {
                System.out.println("Correct Note");
            }

        } while (n < 0 || n > 10);

        input.close();
    }
}