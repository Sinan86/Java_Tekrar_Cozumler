package Java_Tekrar_Cozumler;

import java.util.Scanner;

public class day05IfStatement {

    // Kullanicidan sayi iste ve bu sayinin tek yada pozitif old. konsala yazdir.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int sayi = input.nextInt();
        if (sayi%2 == 0){
            System.out.println("Sayi cifttir.");

        }else {
            System.out.println("Sayi tektir.");
        }

        // Bir sayinin negatif-pozitif -notr old. yazdiriniz.

        Scanner asd = new Scanner(System.in);
        System.out.println("Bir sayi yaziniz...");
        int s = asd.nextInt();
        if (s<0){
            System.out.println("Negatif");
        } else if (s == 0) {
            System.out.println("Nötr");

        }else {
            System.out.println("Pozitif");
        }


    }






}
