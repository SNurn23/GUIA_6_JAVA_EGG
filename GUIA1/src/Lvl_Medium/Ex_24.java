package Lvl_Medium;

import java.util.Scanner;

public class Ex_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [][] matrix;

        System.out.println("Enter a matrix size: ");
        int s = input.nextInt();

        matrix = new int[s][s];

        loadVector(matrix, input);
        antisymmetricMatrix(matrix);

        input.close();
    }

    public static void loadVector(int[][] matrix, Scanner input) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j < matrix[i].length; j++) {
                System.out.print("\nEnter a number in the position [" + i + "]["+j + "]:");
                matrix[i][j] = input.nextInt();
            }
        }

        showMatrix(matrix);
    }

    public static void showMatrix(int[][] m){
        for (int[] ints : m) {
            for (int anInt : ints) {
                System.out.print(anInt + " | ");
            }
            System.out.println();
        }
    }

    public static void antisymmetricMatrix(int[][] matrix) {
        int [][] matrixT = new int[matrix.length][matrix.length];
        boolean band = false;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++){
                matrixT[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nTransposed Matrix");
        showMatrix(matrixT);

        for(int i=0; i<matrixT.length; i++) {
            for(int j=0; j < matrixT[i].length; j++) {
                if(matrixT[i][j] == (matrix[i][j])*(-1)){
                    band = true;
                }
            }
        }

        if (band){
            System.out.println("\nThe matrix is antisymmetric");
        } else {
            System.out.println("\nThe matrix is not antisymmetric");
        }
    }
}