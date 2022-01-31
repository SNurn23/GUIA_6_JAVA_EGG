package Lvl_Medium;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a phrase");
        String phrase = input.nextLine();

        if(phrase.substring(0,1).equals("a") || phrase.substring(0,1).equals("A")){
            System.out.println("CORRECT");
        }else{
            System.out.println("INCORRECT");
        }

        input.close();
    }
}