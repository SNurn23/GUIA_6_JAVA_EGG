package Lvl_Low;

import java.util.Scanner;

public class Ex_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vector;

        System.out.println("Enter vector size:");
        int n = input.nextInt();

        vector = new int[n];
        System.out.println("Enter a number to search: ");
        int v = input.nextInt();

        loadVector(vector);
        searchVector(vector, v);

        input.close();
    }

    public static void loadVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10) + 1;
        }

        for (int j : vector) {
            System.out.print(j + " | ");
        }
    }

    public static void searchVector(int[] vector, int v) {
        int j = 0;
        int[] index = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == v) {
                index[j++] = i;
            }
        }

        if (j == 0) {
            System.out.println("\nValue not found on vector");
        } else if (j == 1) {
            System.out.print("\n|Value found at position: ");
            showPosition(index, j);
        } else {
            System.out.print("\n|The value is repeated in the positions: ");
            showPosition(index, j);
        }

    }

    public static void showPosition(int[] index, int j) {
        for (int i = 0; i < j; i++) {
            System.out.print(index[i] + " | ");
        }
    }
}