package Lvl_Medium;

import java.util.Scanner;

public class Ext_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of students: ");
        int n = input.nextInt();

        calculateAverages(n, input);

        input.close();
    }

    public static void calculateAverages(int n, Scanner input) {
        double[] averages = new double[n], students = new double[4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < students.length; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Enter the note of the first practical evaluation work of the student " + (i + 1) + ": ");
                        students[j] = ((input.nextDouble()) * 0.1);
                        break;
                    case 1:
                        System.out.println("Enter the note of the second practical evaluation work of the student " + (i + 1) + ": ");
                        students[j] = (input.nextDouble() * 0.15);
                        break;
                    case 2:
                        System.out.println("Enter the note of the first integrative of the student " + (i + 1) + ": ");
                        students[j] = (input.nextDouble() * 0.25);
                        break;
                    case 3:
                        System.out.println("Enter the note of the second integrative of the student " + (i + 1) + ": ");
                        students[j] = (input.nextDouble() * 0.50);
                        break;
                }
                averages[i] += students[j];
            }
            System.out.println();
        }
        informCondition(averages);
    }

    public static void informCondition(double[] averages) {
        int contA = 0, contD = 0;
        for (double average : averages) {
            if (average >= 7) {
                contA++;
            } else {
                contD++;
            }
        }

        System.out.println("\nThe amount of approved students is: " + contA);
        System.out.println("\nThe amount of disapproved students is: " + contD);
    }
}