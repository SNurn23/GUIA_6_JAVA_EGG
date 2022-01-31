package Lvl_Medium;

import java.util.Scanner;

public class Ext_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the size of the vector: ");
        int n = input.nextInt();

        int[] v = new int[n];

        loadVector(v);

        input.close();
    }

    public static void loadVector(int[] v){
        for(int i=0; i < v.length; i++){
            v[i] = (int)(Math.random()*10)+1;
        }
        showVector(v);
    }

    public static void showVector(int[] v){
        for (int j : v) {
            System.out.print(j + " | ");
        }
    }
}