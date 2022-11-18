package javaSoruCozumlerim;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
/*
        //Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //Örnek; 223878 ´ 37
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int a =input.nextInt();
        String str = String.valueOf(a);
        String d ="";
        for (int i =0;i<str.length();i++) {
            String c = str.substring(i, i + 1);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                d = d + c;


System.out.println(d);


 */


        //Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        //işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 75.4238 ´ *4*2*3*8
        //1. Yol:

double sayi=75.4238;
String sayi1 =String.valueOf(sayi);

int s =sayi1.indexOf(".");
String d =sayi1.substring(s+1);
        System.out.println(d);
        String toplam="";
    for(int i =0;i<d.length();i++){

     String  w= d.substring(i,i+1);
        toplam=toplam+"*"+w;


    }System.out.println(toplam);




    }

}










/*

        double num = 75.4238;
        String s = String.valueOf(num);
        int idxOfComma = s.indexOf(".");
        String decimalPart = s.substring(idxOfComma + 1);
        String t = "";
        for(Integer i=0; i<decimalPart.length(); i++){
            String r = decimalPart.substring(i,i+1);
            t = t + "*" + r;
        }
        System.out.println(t);



 */


