package Lvl_High;

import java.util.Scanner;

public class Ext_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        do {
            System.out.println("Enter the first number: ");
            n1 = input.nextInt();
            System.out.println("Enter the second number: ");
            n2 = input.nextInt();
        } while (n1 < n2);

        successiveSubtraction(n1, n2);

        input.close();
    }

    public static void successiveSubtraction(int n1, int n2) {
        int rest = n1, cont = 0;

        while (rest >= n2) {
            rest -= n2;
            cont++;
        }

        System.out.println("The rest of the division between " + n1 + " and " + n2 + " is: " + rest);
        System.out.println("The quotient of the division between " + n1 + " and " + n2 + " is: " + cont);
    }
}
