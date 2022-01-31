package Lvl_Medium;

public class Ext_12 {
    public static void main(String[] args) {
        convertNumber();
    }
    public static void convertNumber(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++){

                    String char1 = String.valueOf(i);
                    String char2 = String.valueOf(j);
                    String char3 = String.valueOf(k);

                    if(char1.equals("3")){
                        char1 = "E";
                    }
                    if(char2.equals("3")){
                        char2 = "E";
                    }
                    if(char3.equals("3")){
                        char3 = "E";
                    }

                    System.out.println(char1 + "-" + char2 + "-" + char3);
                }
            }
        }

    }
}