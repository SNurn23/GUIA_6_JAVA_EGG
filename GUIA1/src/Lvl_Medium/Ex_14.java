package Lvl_Medium;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = 'N';

        System.out.println("Enter the first number");
        int n1 = input.nextInt();
        System.out.println("Enter the second number");
        int n2 = input.nextInt();

        do{

            System.out.println("\nChoose an option:\n 1)Add \n 2)Subtract \n 3)Multiply \n 4)Divide \n 5)Exit");
            System.out.print("Option: ");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("The result of the addition between " + n1 + " and " + n2 + " is: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("The result of the subtraction between " + n1 + " and " + n2 + " is: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("The result of the multiplication between " + n1 + " and " + n2 + " is: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Cannot be divided by 0");
                    } else {
                        System.out.println("The result of the dividition between " + n1 + " and " + n2 + " is: " + (n1 / n2));
                    }
                    break;
                case 5:
                    System.out.println("Are you sure you want to exit the program (Y / N)?");
                    c = input.next().charAt(0);
                    break;
                default: System.out.println("the option doesn't exist");
                    break;
            }
        }while (c == 'N' || c == 'n');

        input.close();

    }
}
