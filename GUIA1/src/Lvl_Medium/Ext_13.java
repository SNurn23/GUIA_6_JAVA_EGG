package Lvl_Medium;

import java.util.Scanner;

public class Ext_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        ladderNumbers(n);

        input.close();
    }

    public static void ladderNumbers(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print((j+1)+ " ");
            }
            System.out.println();
        }
    }
}