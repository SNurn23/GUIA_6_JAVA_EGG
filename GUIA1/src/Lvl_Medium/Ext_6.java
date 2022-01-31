package Lvl_Medium;

import java.util.Scanner;

public class Ext_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float height, average = 0, average2 = 0;
        int prom = 0;

        System.out.println("Enter a number of people: ");
        int n = input.nextInt();

        for (int i = 0; i <n ; i++){
            System.out.println("Enter the height of the person: ");
            height = input.nextFloat();
            average2 += height;

            if (height < 1.60) {
                average += height;
                prom++;
            }
        }

        System.out.println("The average number of people who are less than 1.60 tall is: " + (average /prom));
        System.out.println("The average height in general is: " + (average2/n));

        input.close();
    }
}