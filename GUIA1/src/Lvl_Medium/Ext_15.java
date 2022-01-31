package Lvl_Medium;

import java.util.Scanner;

public class Ext_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op = 0;

        System.out.print("\nEnter the first number: ");
        int n1 = input.nextInt();
        System.out.print("\nEnter the second number: ");
        int n2 = input.nextInt();

        while (op != 5) {
            System.out.println("\nChoose a option. 1)Add, 2)Subtract, 3)Multiply, 4)Divide, 5)Exit");
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nThe result of sum between " + n1 + " and " + n2 + " is: " + addNumbers(n1, n2));
                    break;
                case 2:
                    System.out.println("\nThe result of subtract between " + n1 + " and " + n2 + " is: " + subtractNumbers(n1, n2));
                    break;
                case 3:
                    System.out.println("\nThe result of multiplication between " + n1 + " and " + n2 + " is: "+ multiplyNumbers(n1, n2));
                    break;
                case 4:
                    if (divideNumbers(n1, n2) == (-1)) {
                        System.out.println("\nCannot be divided by 0");
                    } else {
                        System.out.println("\nThe result of division between " + n1 + " and " + n2 + " is: " + divideNumbers(n1, n2));
                    }
                    break;
                case 5:
                    break;
            }
        }
        input.close();
    }

    public static int addNumbers(int n1, int n2) {
        return (n1 + n2);
    }

    public static int subtractNumbers(int n1, int n2) {
        return (n1 - n2);
    }

    public static int multiplyNumbers(int n1, int n2) {
        return (n1 * n2);
    }

    public static float divideNumbers(float n1, float n2) {
        if (n2 == 0) {
            return -1;
        } else {
            return (n1 / n2);
        }
    }
}