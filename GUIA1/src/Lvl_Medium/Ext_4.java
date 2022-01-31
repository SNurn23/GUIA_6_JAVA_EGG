package Lvl_Medium;

import java.util.Scanner;

public class Ext_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;

        do{
            System.out.println("Enter a number: ");
            n = input.nextInt();
        }while(n < 1 || n > 10);

        switch (n) {
            case 1:
                System.out.println("The number " + n + " converted to roman is: I");
                break;
            case 2:
                System.out.println("The number " + n + " converted to roman is: II");
                break;
            case 3:
                System.out.println("The number " + n + " converted to roman is: III");
                break;
            case 4:
                System.out.println("The number " + n + " converted to roman is: IV");
                break;
            case 5:
                System.out.println("The number " + n + " converted to roman is: V");
                break;
            case 6:
                System.out.println("The number " + n + " converted to roman is: VI");
                break;
            case 7:
                System.out.println("The number " + n + " converted to roman is: VII");
                break;
            case 8:
                System.out.println("The number " + n + " converted to roman is: VIII");
                break;
            case 9:
                System.out.println("The number " + n + " converted to roman is: IX");
                break;
            case 10:
                System.out.println("The number " + n + " converted to roman is: X");
                break;
        }

        input.close();
    }
}