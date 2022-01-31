package Lvl_Low;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String phrase = input.nextLine();

        System.out.println("In uppercase: " + phrase.toUpperCase() + "  " + "In lowercase: " + phrase.toLowerCase());

        input.close();
    }
}