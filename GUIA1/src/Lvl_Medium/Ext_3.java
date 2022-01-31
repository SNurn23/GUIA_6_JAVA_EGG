package Lvl_Medium;

import java.util.Scanner;

public class Ext_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a letter: ");
        String letter = input.next();

        letter = letter.toUpperCase();
        if (letter.equals("A") || letter.equals("E") || letter.equals("I") || letter.equals("O") || letter.equals("U") ) {
            System.out.println("The letter " + letter + " is a vowel");
        }else{
            System.out.println("The letter " + letter + " is not a vowel");
        }
        input.close();
    }
}