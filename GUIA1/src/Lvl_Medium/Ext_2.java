package Lvl_Medium;

public class Ext_2 {
    public static void main(String[] args) {

        int A = (int)(Math.random()*10) + 1;
        int B = (int)(Math.random()*10) + 1;
        int C = (int)(Math.random()*10) + 1;
        int D = (int)(Math.random()*10) + 1;

        System.out.println("A = " + A + "| B = " + B + "| C = " + C + "| D = " + D);
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("A = " + A + "| B = " + B + "| C = " + C + "| D = " + D);
    }
}