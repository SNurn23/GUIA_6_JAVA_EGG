package Lvl_Medium;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String phrase;
        int corr=0, incr=0;

        do {
            System.out.println("Enter a phrase: ");
            phrase = input.nextLine();

            if((phrase.length() == 5) && (phrase.charAt(0) == 'X') && (phrase.charAt(4) == 'O')){
                corr++;
            }else if(!phrase.equals("&&&&&")){
                incr++;
            }
        } while (!phrase.equals("&&&&&"));

        System.out.println("Corrects pharses: "+ corr +" and incorrects phrases: "+ incr);

        input.close();
    }
}
