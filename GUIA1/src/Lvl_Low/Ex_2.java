package Lvl_Low;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Your name in my program is " + name);

        input.close();
    }
}