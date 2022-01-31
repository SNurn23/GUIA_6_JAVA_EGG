package Lvl_High;

import java.util.Scanner;

public class Ext_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter a number:");
        int n = input.nextInt();

        int[] v = new int[n];

        Fibonacci(v);
        showVector(v);
        input.close();
    }

    public static void Fibonacci(int[] v) {
        for (int i = 0; i < v.length; i++){
            if (i < 2) {
                v[i] = i;
            }else{
                v[i] = v[i - 1] + v[i - 2];
            }
        }
    }

    public static void showVector(int[] v) {
        for (int j : v) {
            System.out.print(j + " | ");
        }
    }
}
