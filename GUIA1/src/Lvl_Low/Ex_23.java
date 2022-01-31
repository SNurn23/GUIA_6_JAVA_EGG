package Lvl_Low;

import java.util.Scanner;

public class Ex_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[4][4];

        loadVector(matrix);
        transposedMatrix(matrix);

        input.close();
    }

    public static void loadVector(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10) + 1;
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " | ");
            }
            System.out.println();
        }
    }

    public static void transposedMatrix(int[][] matrix) {
        int[][] matrixT = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixT[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transposed Matrix");

        for (int[] ints : matrixT) {
            for (int anInt : ints) {
                System.out.print(anInt + " | ");
            }
            System.out.println();
        }
    }
}