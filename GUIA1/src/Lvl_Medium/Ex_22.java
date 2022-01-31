package Lvl_Medium;

import java.util.Scanner;

public class Ex_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] vector;

        System.out.println("Enter a length of the vector");
        int n = input.nextInt();

        vector = new int[n];

        loadVector(vector, input);
        countDigits(vector);

        input.close();
    }

    public static void loadVector(int[] vector, Scanner input) {
        for(int i=0; i<vector.length; i++){
            System.out.println("Enter a number in the position " + i);
            vector[i] = input.nextInt();
        }

        for (int j : vector) {
            System.out.print(j + " | ");
        }
    }

    public static void countDigits(int[] vector){
        int cont, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        for (int i = 0; i < vector.length; i++) {
            cont = 0;
            while (vector[i] != 0) {
                vector[i] /= 10;
                cont++;
            }

            switch (cont) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
        }

        System.out.println("\nthe amount of numbers that only have one digit is:" + cont1);
        System.out.println("the amount of numbers that only have two digits is:" + cont2);
        System.out.println("the amount of numbers that only have three digits is:" + cont3);
        System.out.println("the amount of numbers that only have four digits is:" + cont4);
        System.out.println("the amount of numbers that only have five digits is:" + cont5);
    }
}