package Lvl_Medium;

import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter a phrase");
        String phrase = input.nextLine();

        if(phrase.equals("eureka") || phrase.equals("EUREKA")){
            System.out.println("CORRECT");
        }else{
            System.out.println("INCORRECT");
        }

        input.close();
    }
}