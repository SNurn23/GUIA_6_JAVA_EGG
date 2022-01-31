package Lvl_Medium;

import java.util.Scanner;

public class Ext_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter a number of families:");
        int n = input.nextInt();

        averageChildren(n, input);
    }

    public static void averageChildren(int n, Scanner input) {

        int result, age;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter the number of children in family " + (i+1) + ":");
            int num = input.nextInt();
            result = 0;
            for (int j = 0; j < num; j++) {
                do {
                    System.out.println("\nEnter the age of the child (N°" + (j+1) + "): ");
                    age = input.nextInt();
                } while (age < 0 || age > 100);
                result += age;
            }
            System.out.println("\nThe average age of the children in the family "+ (i+1) + " is " + (result/num));
        }
    }
}
