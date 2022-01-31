package Lvl_High;

import java.util.Scanner;

public class Ex_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] M = new int[10][10], P = new int[3][3];

        System.out.println("First Matrix");
        //loadMatrix(M,input);//loading the first matrix 10x10
        M[0][0]=36;M[0][1]=5; M[0][2]=67;M[0][3]=47; M[0][4]=5;M[0][5]=6; M[0][6]=72;M[0][7]=81; M[0][8]=95;M[0][9]=10;
        M[1][0]=89;M[1][1]=90; M[1][2]=75;M[1][3]=21; M[1][4]=41;M[1][5]=22; M[1][6]=67;M[1][7]=20; M[1][8]=10;M[1][9]=61;
        M[2][0]=14;M[2][1]=22; M[2][2]=26;M[2][3]=90; M[2][4]=9;M[2][5]=90; M[2][6]=17;M[2][7]=12; M[2][8]=87;M[2][9]=67;
        M[3][0]=41;M[3][1]=87; M[3][2]=24;M[3][3]=56; M[3][4]=97;M[3][5]=74; M[3][6]=87;M[3][7]=42; M[3][8]=67;M[3][9]=45;
        M[4][0]=32;M[4][1]=76; M[4][2]=79;M[4][3]=1; M[4][4]=36;M[4][5]=5; M[4][6]=67;M[4][7]=98; M[4][8]=12;M[4][9]=11;
        M[5][0]=99;M[5][1]=13; M[5][2]=54;M[5][3]=88; M[5][4]=89;M[5][5]=90; M[5][6]=75;M[5][7]=12; M[5][8]=41;M[5][9]=76;
        M[6][0]=67;M[6][1]=78; M[6][2]=87;M[6][3]=45; M[6][4]=14;M[6][5]=22; M[6][6]=26;M[6][7]=42; M[6][8]=56;M[6][9]=78;
        M[7][0]=98;M[7][1]=45; M[7][2]=34;M[7][3]=23; M[7][4]=32;M[7][5]=56; M[7][6]=74;M[7][7]=16; M[7][8]=19;M[7][9]=18;
        M[8][0]=24;M[8][1]=67; M[8][2]=97;M[8][3]=46; M[8][4]=87;M[8][5]=13; M[8][6]=67;M[8][7]=89; M[8][8]=93;M[8][9]=24;
        M[9][0]=21;M[9][1]=68; M[9][2]=78;M[9][3]=98; M[9][4]=90;M[9][5]=67; M[9][6]=12;M[9][7]=41; M[9][8]=65;M[9][9]=12;
        showMatrix(M);
        System.out.println("\nSecond matrix");
        loadMatrix(P, input);// loading the second matix 3x3
        searchMatrix(M, P);
    }

    public static void loadMatrix(int[][] matrix, Scanner input) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("\nEnter a number in the position [" + i + "][" + j + "]:");
                matrix[i][j] = input.nextInt();
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

    public static void searchMatrix(int[][] M, int[][] P) {
        int cont1 = 0, cont2 = 0, k = 0, l = 0, cont = 0;
        boolean band = false, b = false;
        int[][] matrix = new int[3][3];

        while (!band) {
            k = 0;
            for (int i = cont1; i < (cont1 + 3); i++) {
                l = 0;
                for (int j = cont2; j < (cont2 + 3); j++) {
                    matrix[k][l] = M[i][j];
                    l++;
                }
                k++;
            }

            cont = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == P[i][j]) {
                        cont++;
                    }
                }
            }

            if (cont == 9) {
                System.out.print("\nThe submatrix P is in the following positions of the matrix M:");
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print("[" + (cont1 + i) + "][" + (cont2 + j) + "]-");
                    }
                }
                b = true;
            }

            if (cont1 == (M.length - 3) && cont2 <= (M.length - 2)) {
                cont1 = 0;
                cont2++;
            } else {
                cont1++;
            }
            if (cont1 == 0 && cont2 == (M.length - 2)) {
                band = true;
            }
        }

        if (!b) {
            System.out.print("\nSubmatrix P is not found in matrix M");
        }
    }
}
