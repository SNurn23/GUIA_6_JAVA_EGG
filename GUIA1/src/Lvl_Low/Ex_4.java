package Lvl_Low;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a temperature in degrees Celsius: ");
        float Celsius = input.nextFloat();

        System.out.println("The temperature in degrees Fahrenheit: " + (32 + (9 * Celsius / 5)) + "° F");

        input.close();
    }
}