package Lvl_Medium;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int engineType = input.nextInt();

        switch (engineType) {
            case 1:
                System.out.println("The bomb is a Water Pump");
                break;
            case 2:
                System.out.println("The bomb is a Petrol Pump");
                break;
            case 3:
                System.out.println("The bomb is a Concrete Pump");
                break;
            case 4:
                System.out.println("The bomb is a Nutrional pasta Pump");
                break;
            default:
                System.out.println("No there is a valid value for pump type");
                break;
        }

        input.close();
    }
}