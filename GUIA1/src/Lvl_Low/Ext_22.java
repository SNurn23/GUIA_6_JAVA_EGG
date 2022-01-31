package Lvl_Low;

import java.util.Scanner;

public class Ext_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of rows: ");
        int r = input.nextInt();
        System.out.println("Enter a number of columns: ");
        int c = input.nextInt();

        int[][] M = new int[r][c];

        loadMatrix(M);
        addMatrix(M);

        input.close();
    }

    public static void loadMatrix(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        showMatrix(M);
    }

    public static void showMatrix(int[][] M) {
        for (int[] ints : M) {
            for (int anInt : ints) {
                System.out.print(anInt + " | ");
            }
            System.out.println();
        }
    }

    public static void addMatrix(int[][] M) {
        int result = 0;

        for (int[] ints : M) {
            for (int anInt : ints) {
                result += anInt;
            }
        }

        System.out.println("The result of the suma between all the elements of the matrix is: " + result);
    }
}