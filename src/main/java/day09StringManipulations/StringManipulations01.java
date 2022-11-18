package day09StringManipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Kara kara dusunme Ankara";

        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1);

        int idxA2 = str.lastIndexOf("kara");
        System.out.println(idxA2);

        //Example 1: Bir String'deki bir character'in tekrarli veya tekrarszi olup olmadigini gosteren kodu yaziniz
        //           "Helloooo" ==> H-->Tekrarsiz     e-->Tekrarsiz     l-->Tekrarli     o-->Tekrarli

        String t = "Helloooo";
        char c = 'o';

       String result = t.indexOf(c)==t.lastIndexOf(c) ? "Tekrarsiz" : "Tekrarli";
        System.out.println(result);

        String u = "Learn Java earn money";

        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra istenen character'in
        //ilk gorunumunun indexini return eder.
        int sonuc = u.indexOf("e", 4);
        System.out.println(sonuc);//11



        String v = "";
        //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder.
        //Eger String'de hic character yoksa isEmpty() "true" return eder, her hangi bir character varsa "false" return eder.
        // length()==0 demek isEmpty() true verir demektir.
        //Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty()" kullanin
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        String x = " ";
        //isBlank() hem "bos String" icin hem de "sadece space" iceren String'ler icin true return eder.
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);//true

        //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Isminizi girin...");
        String isim =input.nextLine();
        boolean a= isim.isBlank();
        String b = a ? "Ismini Yaz..." : isim ;
        System.out.println(b);







    }


}
