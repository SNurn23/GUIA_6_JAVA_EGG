package Lvl_Low;

public class Ex_20 {
    public static void main(String[] args) {
        int[] v = new int[100];

        loadVector(v);
    }

    public static void loadVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;
        }

        System.out.println("Vector in ascending order");
        for (int j : v) {
            System.out.print(j + " | ");
        }

        System.out.println("\nVector in descending order");
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.print(v[i] + " | ");
        }
    }
}