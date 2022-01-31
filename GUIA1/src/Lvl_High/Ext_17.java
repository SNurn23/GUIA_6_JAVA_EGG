package Lvl_High;

import java.util.Scanner;

public class Ext_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        if(primeNumbers(n)){
            System.out.println("The number " + n + " is prime.");
        }else{
            System.out.println("The number " + n + " is not prime");
        }

        input.close();
    }

    public static boolean primeNumbers(int n){
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if(n%(i+1) == 0){
                cont++;
            }
        }

        return cont == 2;
    }
}
