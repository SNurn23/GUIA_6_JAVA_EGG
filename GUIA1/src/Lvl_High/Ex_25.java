package Lvl_High;

import java.util.Scanner;

public class Ex_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int[][] matrix;

        do {
            System.out.println("Enter a matrix size:");
            n = input.nextInt();
        } while (n < 2 || n > 10);

        matrix = new int[n][n];

        loadMatrix(matrix, input);
        magicSquare(matrix);

        input.close();

    }

    public static void loadMatrix(int[][] matrix, Scanner input) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                do {
                    System.out.print("\nEnter a number in the position [" + i + "][" + j + "]:");
                    matrix[i][j] = input.nextInt();
                } while (matrix[i][j] < 1 || matrix[i][j] > 9);
            }
        }

        showMatrix(matrix);
    }

    public static void showMatrix(int[][] m) {
        for (int[] ints : m) {
            for (int anInt : ints) {
                System.out.print(anInt + " | ");
            }
            System.out.println();
        }
    }

    public static void magicSquare(int[][] matrix) {
        int cF = 0, cC = 0, cDP = 0, cDS = 0, k = matrix.length - 1;
        int[] x = new int[matrix.length], y = new int[matrix.length];
        boolean b = false;

        for (int i = 0; i < matrix.length; i++) {
            cF = 0;
            cC = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                cF += matrix[i][j];
                cC += matrix[j][i];

                if (i == j) {
                    cDP += matrix[i][j];
                }

                if (j == k) {
                    cDS += matrix[i][j];
                }

            }
            k--;
            x[i] = cF;
            y[i] = cC;
        }

        for (int i = 0; i < x.length; i++) {
            if (x[i] == cDS && y[i] == cDS && x[i] == cDP && y[i] == cDP) {
                b = true;
            }
        }
        if (b) {
            System.out.println("Is a magic square");
        } else {
            System.out.println("Is not a magic square");
        }
    }
}
