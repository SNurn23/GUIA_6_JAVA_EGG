package Lvl_Medium;

import java.util.Scanner;

public class Ext_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a time in minutes:");
        int time = input.nextInt();

        int hours = (time/60);

        if (hours < 24){
            System.out.println((hours/24) + " days, "+ hours + " hours, "+ (time % 60) + " minutes");
        }else{
            System.out.println((hours/24) + " days, "+ (hours % 24)  + " hours, " + (time % 60) + " minutes");
        }

        input.close();
    }
}