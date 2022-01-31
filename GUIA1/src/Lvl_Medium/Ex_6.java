package Lvl_Medium;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the first number");
        int n1 = input.nextInt();
        System.out.println("Enter the second number");
        int n2 = input.nextInt();

        if(n1 > n2){
            System.out.println("The number " + n1 + " is greater than the number " + n2);
        }else if(n1 == n2){
            System.out.println("Both numbers are the same");
        }else{
            System.out.println("The number " + n2 + " is greater than the number " + n1);
        }

        input.close();
    }
}