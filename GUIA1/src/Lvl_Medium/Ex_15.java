package Lvl_Medium;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Enter a number");
            int n = input.nextInt();

            if (n > 0) {
                sum += n;
            } else if (n == 0) {
                break;
            }
        }

        System.out.println("The result of the sum between the 20 numbers entered is: " + sum);

        input.close();
    }
}
