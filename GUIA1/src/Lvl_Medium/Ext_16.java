package Lvl_Medium;

import java.util.Scanner;

public class Ext_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter a number of people: ");
        int n = input.nextInt();

        verifyAge(n, input);

        input.close();
    }

    public static void verifyAge(int n, Scanner input){
        String[] names = new String[n];
        int [] ages = new int[n];
        String op = "YES";

        for(int i = 0; i < names.length; i++){
            System.out.println("Enter a name of the person N° " + (i+1) + ":");
            names[i] = input.next();
            System.out.println("Enter the age of "+ names[i] + ": ");
            ages[i] = input.nextInt();
        }

        for(int i = 0; i < ages.length; i++){
            if(op.equals("NO")){
                break;
            }else{
                if(ages[i] >= 18){
                    System.out.println("\n" + names[i] + " is "+ ages[i] + " years old, therefore she is of legal age ");
                }else{
                    System.out.println("\n" +names[i] + " is "+ ages[i] + " years old, therefore she is a minor ");
                }
            }
            System.out.println("\nDo I keep showing you people? NO or YES: ");
            op = input.next().toUpperCase();
        }

    }
}