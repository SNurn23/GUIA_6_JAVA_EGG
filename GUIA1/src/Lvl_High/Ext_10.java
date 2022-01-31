package Lvl_High;

import java.util.Scanner;

public class Ext_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = (int) (Math.random() * 10) + 1;
        int n2 = (int) (Math.random() * 10) + 1;

        guessResult(n1, n2, input);

        input.close();
    }

    public static void guessResult(int n1, int n2, Scanner input) {
        boolean found = false;

        while (!found) {
            System.out.println("\nGuess! What is the result of the multiplication?");
            int result = input.nextInt();

            if (result == (n1 * n2)) {
                System.out.println("CORRECT!");
                found = true;
            } else if (result < (n1 * n2)) {
                System.out.println("INCORRECT! The number is less than the result. Try again!");
            } else if (result > (n1 * n2)) {
                System.out.println("INCORRECT! The number is bigger than the result. Try again!");
            }
        }
    }
}
