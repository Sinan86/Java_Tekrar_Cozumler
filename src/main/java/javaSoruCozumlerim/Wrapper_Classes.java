package javaSoruCozumlerim;

import java.util.Scanner;

public class Wrapper_Classes {

    public static void main(String[] args) {

     //1) Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını 
        //bulmak için bir kod yazınız
        
        byte min = Byte.MIN_VALUE;
        System.out.println("min = " + min);
        short max = Short.MAX_VALUE;
        System.out.println("max = " + max);
        System.out.println(min+max);

        //2) Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        //yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        //değişken arasındaki farkı yazdırınız.

       byte sayi1 = Byte.valueOf("113");
       short sayi2 = Short.valueOf("2351");
        System.out.println(sayi2-sayi1);

        /*
        ) valueOf(String s) ile parseByte(String s) methodları arasındaki farklar nelerdir?
parseByte() ilkel tamsayı (primitive integer) tipini (int) döndürürken; valueOf(), ilkel tamsayının
nesne temsilcisi olan Java.lang.Integer'ı döndürür. Primitive türler yerine, bir tamasyı nesnesini
isteyebileceğimiz durumlar da vardır.
Bariz olan bir diğer fark ise; valueOf() bir örnek metod(instance method) iken parseByte() statik
bir metoddur
         */
/* TASK :
     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
                * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
                */


        Scanner urun = new Scanner(System.in);

        System.out.println("Ürunun adedini ");
        int urunAdet = urun.nextInt();   //ürün sayisi
        int listeFiyati = 3;

        int toplamFiyat = urunAdet * listeFiyati;

        System.out.println("Musteri kartiniz varsa Var yazin?");

        String kart = urun.next();
        boolean a = kart.equalsIgnoreCase("Var");

/*
        if(kart.equalsIgnoreCase("Var")&&urunAdet>9){
            System.out.println(toplamFiyat - (toplamFiyat * 0.2));
        } else if (kart!="Var"&&urunAdet>9) {
            System.out.println(toplamFiyat - (toplamFiyat * 0.15));
        }else if(urunAdet<10){
            System.out.println(toplamFiyat-(toplamFiyat*0.1));
        }
*/

        if (a && urunAdet>9) {
            System.out.println(toplamFiyat - (toplamFiyat * 0.2));

        }

    }


}
