package Lvl_Low;

import java.util.Scanner;

public class Ext_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of vector: ");
        int n = input.nextInt();

        int[] vector = new int[n];

        loadVector(vector, input);
        addVector(vector);

        input.close();
    }

    public static void loadVector(int[] vector, Scanner input) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter a number in the position " + i + ": ");
            vector[i] = input.nextInt();
        }

        showVector(vector);
    }

    public static void addVector(int[] vector) {
        int result = 0;

        for (int j : vector) {
            result += j;
        }

        System.out.println("\nThe result of the sum of the vector is: " + result);
    }

    public static void showVector(int[] vector) {
        for (int j : vector) {
            System.out.print(j + " | ");
        }
    }
}