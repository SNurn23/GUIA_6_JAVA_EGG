package Lvl_Low;

import java.util.Scanner;

public class Ext_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of two vectors: ");
        int n = input.nextInt();

        int[] v1 = new int[n], v2 = new int[n];

        System.out.println("Loading the first vector...");
        loadVector(v1, input);
        System.out.println("\nLoading the second vector...");
        loadVector(v2, input);

        if (checkEquality(v1, v2)) {
            System.out.println("\nThe two vectors are equal");
        } else {
            System.out.println("\nThe two vectors are not equal");
        }

        input.close();
    }

    public static void loadVector(int[] vector, Scanner input) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("\nEnter a number in the position " + i + ": ");
            vector[i] = input.nextInt();
        }
        showVector(vector);
    }

    public static void showVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " | ");
        }
    }

    public static boolean checkEquality(int[] v1, int[] v2) {

        for (int i = 0; i < v2.length; i++) {
            if (v1[i] != v2[i]) {
                return false;
            }
        }
        return true;
    }
}