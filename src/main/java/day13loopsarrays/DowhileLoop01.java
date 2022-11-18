package day13loopsarrays;

import java.util.Scanner;

public class DowhileLoop01 {

    public static void main(String[] args) {

//Example 1: Kullanicidan bir sayi aliniz, sayi 100 den kucuk ise ekrana "Kazandiniz!" yazdiriniz
        //           Aksi halde ekrana "Kaybettiniz!" yazdiriniz.
        //           Kullanici kazandikca oyun devam etmeli.


        Scanner input = new Scanner(System.in);
/*
        for (int i = input.nextInt(); i < 100; input.nextInt()) {

            System.out.println("Bir sayi giriniz...");

            if (i < 100) {
                System.out.println("Kazandin");
            } else {
                System.out.println("Kaybettiniz...");
                break;

            }




        }

        int i=0;
        do {
            System.out.println("Bir sayi giriniz");
             i = input.nextInt();
            if (i < 100) {
                System.out.println("Kazandiniz");
            } else {
                System.out.println("Kaybettiniz...");

            }



        } while (i < 100) ;

 */

            System.out.println();

            Scanner input1 = new Scanner(System.in);
            char ch = 'a';

            do {

                System.out.println("Isminizi giriniz...");
                String name = input1.next();
                ch = name.charAt(0);
            }
            while (ch <= 'Z' && ch >= 'A');

            System.out.println("Ilk harfi buyuk yaziniz...");

    }
}
