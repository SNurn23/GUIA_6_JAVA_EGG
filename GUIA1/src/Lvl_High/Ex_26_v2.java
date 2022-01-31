package Lvl_High;

import java.util.Scanner;

public class Ex_26_v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] M = new int[10][10], P = new int[3][3];

        System.out.println("First Matrix");
        loadMatrixM(M);// loading the first matrix 10x10
        System.out.println("\nSecond matrix");
        loadMatrixP(P, input);// loading the second matrix 3x3
        searchMatrix(M, P);
    }

    public static void loadMatrixM(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        showMatrix(M);
    }

    public static void loadMatrixP(int[][] P, Scanner input) {
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P[i].length; j++) {
                System.out.print("\nEnter a number in the position [" + i + "][" + j + "]:");
                P[i][j] = input.nextInt();
            }
        }
        showMatrix(P);
    }

    public static void showMatrix(int[][] m) {
        for (int[] ints : m) {
            for (int anInt : ints) {
                System.out.print(anInt + " | ");
            }
            System.out.println();
        }
    }

    public static void searchMatrix(int[][] M, int[][] P) {
        int p1 = 0, p2 = 0, k = 0, l = 0, cont = 0;
        boolean b=false;

        for (int i = 0; i < (M.length - 3); i++) {
            for (int j = 0; j < (M[i].length - 3); j++) {
                if (M[i][j] == P[0][0]) {
                    p1 = i;
                    p2 = j;
                    b = true;
                }
                if(b){break;}
            }
            if(b){break;}
        }

        for (int i = p1; i < (p1 + 3); i++) {
            l = 0;
            for (int j = p2; j < (p2 + 3); j++) {
                if (M[i][j] == P[k][l]) {
                    cont++;
                }
                l++;
            }
            k++;
        }

        if (cont == 9) {
            System.out.print("\nThe submatrix P is in the following positions of the matrix M:");
            for(int i=p1; i < (p1 + 3); i++){
                for(int j=p2; j < (p2 + 3); j++){
                    System.out.print("[" + i + "][" + j + "]-");
                }
            }

        }
        cont = 0;
        k=0;
    }
}
