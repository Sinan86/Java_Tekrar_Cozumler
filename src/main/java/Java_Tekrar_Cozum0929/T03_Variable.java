package Java_Tekrar_Cozum0929;

import java.util.Scanner;

public class T03_Variable {

    public static void main(String[] args) {
/*
        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz");
        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);


        Scanner input1 =new Scanner(System.in);
        System.out.println("Ucbasamakli bir sayi giriniz");
        int sayi = input1.nextInt();
        int birler = sayi%10;
        int ikib = sayi/10;
        int onlar = ikib%10;
        int yuzler = sayi/100;

        System.out.println("Birler basamagi =" + birler);
        System.out.println("Onlar basamagi =" + onlar);
        System.out.println("Yüzler basamagi =" + yuzler);
      */

        Scanner input2 = new Scanner(System.in);
        System.out.println("Bes basamakli bir sayi giriniz");
        int sayi1 =input2.nextInt();
        int birler = sayi1%10;
        int dbas = sayi1/10;
        int onlar = dbas%10;
        int ibas = sayi1/1000;
        int binler = ibas%10;
        int onbinler = ibas/10;
        System.out.println("Ilk iki basamagin toplami =" + (onbinler+binler));
        System.out.println("Son iki basamagin toplami =" + (birler+onlar));
        int top = birler+onlar+binler+onbinler;
        System.out.println("Toplam =" + top);



    }



}
