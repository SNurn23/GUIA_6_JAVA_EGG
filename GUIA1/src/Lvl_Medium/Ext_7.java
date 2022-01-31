package Lvl_Medium;

import java.util.Scanner;

public class Ext_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter a number as a limit:");
        int n = input.nextInt();

        System.out.println("Choose an option to solve the program: 1)While, 2)Do While");
        int op = input.nextInt();

        if(op == 1){
            versionWhile(n, input);
        }else{
            versionDoWhile(n, input);
        }

        input.close();
    }

    public static void versionWhile(int n, Scanner input) {
        int cont=0, max = 0, min = 0, average = 0;

        while(cont < n){
            System.out.println("Enter a number");
            int num = input.nextInt();

            if(num >= max){
                max = num;
            }else if(num < min){
                min = num;
            }

            if(num > 0){
                average += num;
            }

            cont++;
        }

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        System.out.println("The average of numbers greater than 0 is: " + (average/cont));
    }

    public static void versionDoWhile(int n, Scanner input) {
        int cont=0, max = 0, min = 0, average = 0;

        do {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if(num >= max){
                max = num;
            }else if(num < min){
                min = num;
            }

            if(num > 0){
                average += num;
            }
            cont++;
        } while (cont < n);

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        System.out.println("The average of numbers greater than 0 is: " + (average/cont));
    }
}