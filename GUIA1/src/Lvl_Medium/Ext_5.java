package Lvl_Medium;

import java.util.Scanner;

public class Ext_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String c;
        float cost;

        do {
            System.out.println("Enter the type of partner:");
            c = input.next();
            c = c.toUpperCase();
        } while(!(c.equals("A") || c.equals("B") || c.equals("C")));

        do {
            System.out.println("Enter the cost of the treatment:");
            cost = input.nextFloat();
        } while (cost < 1);

        switch (c) {
            case "A":   System.out.println("the amount in cash to be paid by partner " + c + " is $" + (cost * 0.5));
                break;
            case "B":   System.out.println("the amount in cash to be paid by partner " + c + " is $" + (cost * 0.35));
                break;
            case "C":   System.out.println("the amount in cash to be paid by partner " + c + " is $" + cost);
                break;
        }

        input.close();
    }
}