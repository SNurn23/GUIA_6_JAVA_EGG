package Lvl_Medium;

import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter a number");
        int n = input.nextInt();

        if((n%2) == 0){
            System.out.println(n + " is an even number");
        }else{
            System.out.println(n + " is an odd number");
        }

        input.close();
    }
}