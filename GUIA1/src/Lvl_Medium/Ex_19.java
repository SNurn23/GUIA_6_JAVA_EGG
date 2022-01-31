package Lvl_Medium;

import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int change;

        System.out.println("Enter an amount of euros: ");
        float price = input.nextFloat();

        do{
            System.out.println("Choose an option to convert: 1)Pounds, 2)Yen, 3)Dollars");
            change = input.nextInt();
        }while((change != 1) && (change != 2) && (change != 3));

        changeEuro(price, change);

        input.close();
    }

    public static void changeEuro(float price, int change){
        switch (change) {
            case 1:
                System.out.println("Euros: " + price + " | Pounds: £" + (price * 0.86));
                break;
            case 2:
                System.out.println("Euros: " + price + " | Yen: ¥" + (price * 129.852));
                break;
            case 3:
                System.out.println("Euros: " + price + " | Dollars: $" + (price * 1.28611));
                break;

        }
    }
}