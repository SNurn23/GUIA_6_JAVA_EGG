package Lvl_High;

import java.util.Random;
import java.util.Scanner;

public class Ext_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String [][] soup = new String[20][20];

        loadWords(input, soup);
        input.close();

    }

    public static void loadWords(Scanner input, String[][] soup){
        int cont=0, c = 0, f = 0;
        String word;
        Random random=new Random();

        while (cont < 5) {
            do {
                System.out.println("Enter a word for the soup of letters: ");
                word = input.next();
            } while (word.length() < 3 || word.length() > 5);

            word = word.toUpperCase();
            int n=0;

            do {
                n = (int) (Math.random() * 19) + 1;
            } while (soup[n][0] != null);

            f =  (int) ((Math.random() * 14) + 1);

            for (int i = f; i < (f + word.length()); i++) {
                soup[n][i] = word.substring(c, c +1);
                c++;
            }

            for (int i = 0; i < soup.length; i++) {//
                if(soup[n][i] == null){
                    soup[n][i] = String.valueOf(random.nextInt(9));
                }
            }
            c=0;
            cont++;
        }

        for(int i = 0; i < soup.length; i++){
            for (int j = 0; j < soup[i].length; j++) {//
                if(soup[i][j] == null){
                    soup[i][j] = String.valueOf(random.nextInt(9));
                }
            }
        }

        showMatrix(soup);
    }

    public static void showMatrix(String[][] m){
        for (String[] strings : m) {
            for (String string : strings) {
                System.out.print(string + " | ");
            }
            System.out.println();
        }
    }
}
