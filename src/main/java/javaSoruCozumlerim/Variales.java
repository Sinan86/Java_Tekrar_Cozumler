package javaSoruCozumlerim;

import java.util.Scanner;

public class Variales {
    public static void main(String[] args) {


        // 1) Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
        // toplamını konsola yazdırınız.
        double laptop =660;
        double kulaklik =39.9;
        double kursUcreti =1650;
        double toplam = laptop+kulaklik+kursUcreti;
        System.out.println("toplam = " + toplam);

        //2) Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
        //değişkenlerin değerlerinin çarpımını konsolda yazdırınız.
        
        float ilk =15.5f;
        long ikinci= 123L;
        int ucuncu = 12;
        float sonuc =ilk*ikinci* ucuncu;
        System.out.println("sonuc = " + sonuc);

        // 3) Basit faizi bulmak için bir kod yazınız.
        // Not: Basit faiz formülü = anapara * oran * yılDegeri /100

        float anpara = 1000F;
        float faiz = 0.03F;
        float faizMiktari =anpara*faiz;
        System.out.println("faizMiktari = " + faizMiktari);


        // 4) Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
        // toplamını ve çarpımını String ile yazdırınız

        String a ="Sonuc";
        long b = 12L;
        long c = 13L;
        long d =b+c;
        long e =b*c;
        System.out.println(a+d+" " +e);

        //5) Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve bu değerleri iki
        // ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.

        boolean first = true;
        boolean second= false;
        System.out.println(first+" "+ second);

        //6) 3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
        //Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.

        long kitap = 123L;
        long defter =50L;
        long laptop1= 10000L;
        System.out.println(2*kitap+4*defter+3*laptop1);

        //İki tamsayıyı değiştirmek için bir kod yazınız.
// 1. way
        Scanner scr = new Scanner(System.in);
        System.out.println("Iki sayi giriniz...");
        double n1= scr.nextDouble();
        double n2 = scr.nextDouble();
       /* double n5 = n1+n2;
        double n4 = n5-n2;
        double n3 = n5-n1;
        System.out.println( n3+" "+n4);

        */
//2.way
        double temp = n1;
        n1=n2;
        n2=temp;
        System.out.println(n1+" "+n2);





    }
}
