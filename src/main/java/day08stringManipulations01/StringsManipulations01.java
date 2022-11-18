package day08stringManipulations01;

import java.util.Scanner;

public class StringsManipulations01 {

    //Example 1: Kullanicidan aldiginiz isimin ilk ve son harfini ekrana yazdiriniz
    //           Ramazan ==> Rn
    public static void main(String[] args) {
        /*
//1. yol
        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi giriniz...");

        String name = input.next();
        char ilkharf = name.charAt(0);
        char sonHarf = name.charAt(name.length() - 1);
        System.out.println(" " + ilkharf + sonHarf);

        // 2. yol

        String ilkharf1 = name.substring(0, 1);
        String sonharf2 = name.substring(name.length() - 1);
        System.out.println(ilkharf1 + sonharf2);

        //Example 2: Verilen String'deki sadece hayvan isimlerini ekrana yazdiriniz
        //           "Ben kedi, esim tavuk, oglum sever inek"

        String str = "Ben kedi, esim tavuk, oglum sever inek";
        String kedi = str.substring(4, 9);
        String tavuk = str.substring(15, 21);
        String inek = str.substring(str.length() - 4);
    System.out.println(kedi+tavuk+inek);

    //Example 3: Ilk isim ve soy isimi iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdiriniz
    //           Ali Can ==> AC       Tahsin Yurdakul ==> TY

        Scanner input1 = new Scanner(System.in);
        System.out.println("Adinizi ve soyadinizi giriniz...");
        String name1 = input1.nextLine();
        String ilk = name1.substring(0,1);
        String ikinci = name1.split(" ")[1].substring(0,1);
        System.out.println(ilk+ikinci);


        //Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz
        //           "Ali okula gitti." ==> 14

        String str1 = "Ali okula gitti.";
        int sayi = str1.replace(" ","").length();
        System.out.println(sayi);

        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.

        String s= "Ankara'nin tasina gozlerimin yasina bak.";
        String news = s.replaceAll("a","A");
        System.out.println("news = " + news);

        //Example 3: Bir String'deki tum "kara" kelimelerinin yerine "*" koyunuz

        String t = "Kara kara dusunme Ankara";
        String tYeni =t.replace("kara","*");
        System.out.println("tYeni = " + tYeni);



//Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********
        String stdId = "AC202117004";
        String newStdId = stdId.replaceAll("[0-9]","*");
        System.out.println("newStdId = " + newStdId);

        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
        //           tum karakterlerin sayisini bulan kodu yaziniz
        String u = "Ali 13 yasinda, dersem inanma!...";

        int sonuc= u.
                     replaceAll("[0-9]", "").
                     replaceAll(" ","").
                     replaceAll("\\p{Punct}","").
                     length();
        System.out.println(sonuc);


        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli

        String pwd = "A78c !m";
        boolean first =pwd.replace(" ","").length()>7;
        boolean second = pwd.replaceAll("[^\\p{Punct}]","").length()>0;
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;
        boolean forth =pwd.replaceAll("[^A-Z]","").length()>0;
        boolean fifth =pwd.replaceAll("[^a-z]","").length()>0;

        System.out.println(first&&second&&third&&forth&&fifth);



        //Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz
        String cumle = "Sen yapmazsan, ben ?...";

        int cumleS= cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println("cumleS = " + cumleS);


         */
        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //           aksi halde "Normal" yazdirin.

        String v = "Alex";
        boolean a = v.startsWith("Al");
        boolean b = v.endsWith("x");
      /*  boolean sonuc = a && b;
        if (sonuc) {
            System.out.println("Harika");
        } else {
            System.out.println("Normal");
*/
       String result = a&&b ? "Harika" : "Normal";
        System.out.println(result);
        }


    }

