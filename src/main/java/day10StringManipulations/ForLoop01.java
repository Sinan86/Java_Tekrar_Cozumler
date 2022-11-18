package day10StringManipulations;

public class ForLoop01 {
    public static void main(String[] args) {
/*
        int i;
        for (i = 4; i < 18; i+=3){

            System.out.print(i+" ");
        }
        System.out.println();

        for(int k =14;k>4;k--){
            System.out.print(k +" ");
        }
        System.out.println();

        for (int k =14; k>4; k--) {

            if (k % 2 == 0) {
                System.out.print(k + " ");

            }
        }
            System.out.println();

            for (int n = 28; n<158; n++){
                if(n%2!=0){
                    System.out.print(n+" ");
                }
            }




        System.out.println();
        String a = "Java Kolaydir";

        for (int b = 0; b < a.length(); b++) {
            char c = a.charAt(b);
            if (c == 'a') {
                System.out.print("*");

            } else {
                System.out.print(c);
            }
*/

            System.out.println();
            String str = "Hellooo";
            for (int f = 0; f < str.length(); f++) {
                char z = str.charAt(f);
                if (str.indexOf(z) == str.lastIndexOf(z)) {
                    System.out.print(z);
                }


            }


        }

    }


