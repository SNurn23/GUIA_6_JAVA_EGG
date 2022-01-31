package Lvl_Medium;

import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String phrase;

        do {
            System.out.println("Enter a phrase");
            phrase = input.nextLine();

            if (phrase.length() == 8) {
                System.out.println("CORRECT");
            }else{
                System.out.println("INCORRECT");
            }

        } while (phrase.length() != 8);

        input.close();
    }
}