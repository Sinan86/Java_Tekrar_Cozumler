package javaSoruCozumlerim;

public class StringManipulations01 {
    public static void main(String[] args) {
/*
        // Example 1
        String sehirIsmi ="miami";
        String konsolSehirIsmi = sehirIsmi.trim().toLowerCase();
        konsolSehirIsmi= sehirIsmi.substring(0,1).toUpperCase()+ konsolSehirIsmi.substring(1);
        System.out.println(konsolSehirIsmi);

    // Example 2
        String isim1 ="Esma Sonmez";
        String isim2 ="Alp Taha Sonmez";
        String isim3 ="Zümra Sonmez";
        int ilk = isim1.replaceAll(" ","").trim().length();
        int ikinci = isim2.replaceAll(" ","").trim().length();
        int ücuncü = isim3.replaceAll(" ","").trim().length();
        System.out.println(ilk+ikinci+ücuncü);



        // Example 3
        //Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        //konsolda yazdırınız.
        //Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir

        String str ="Motivasyonu %100 cikartmam gerek...";
       str=str.replaceAll("\\W","");
        System.out.println(str.length());

     //Example4

        //Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        //konsolda yazdırınız.
        //Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
        String s="2a§B4?-5";
        s=s.replaceAll("\\d","");
        System.out.println(s.length());

     //Example 5

        //Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.
        //Örnek:'Ali Can' için n yazdırmalısınız.
        // ‘Miami’ için i yazdırmalısınız

        String f ="Ali Can";
        String g ="Miami";
        String f1=f.substring(f.trim().length()-1);
        String g1=g.substring(g.trim().length()-1);
        System.out.println(f1+" "+g1);


       // 6) Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
       // toplamını bulunuz.
        //1.way
        String k="Miami";
        char ilk=k.charAt(0);
        char son=k.charAt(k.length()-1);
        System.out.println(ilk+son);



        //7) Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
        //yazdırınız

        String r ="Miami";
        String r1= r.substring(1);
        System.out.println("ilk karakterler disindaki karakterler = " + r1);


      //8) Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        //büyük harfle yazdırınız.
        //Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
        String h="Java";
        String h1 =h.toUpperCase().substring(0,h.length()-1);
        System.out.println(h1);



        //9) Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
        //karakterleri büyük harflerle yazdırınız.
        //Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız

        String k="Java";
        String k1=k.substring(1,k.length()-1).toUpperCase();
        System.out.println(k1);

        // 10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        // olmadığını kontrol etmek için kod yazınız.
        // Örnek:‘Ali     Can’ için konsolda false yazmalıdır.
        //‘    Ali Can ’ için konsolda false yazmalıdır.
        //‘ Ali     Can ’ için konsolda false yazmalıdır.
        //‘AliCan’ için konsolda true yazmalıdır.

        String ad ="Tom Hanks";
        String yAd= ad.replaceAll("\\S","");
       boolean result =yAd.isEmpty();
        System.out.println(result);


        //11) Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
        //yazınız.
        //Örnek:‘ Ali ’ için kodunuz konsolda false yazmalıdır
        // ‘Ali’ için kodunuz konsolda true yazmalıdır
        String s = " Tom ";
        String s1=s.trim();
        int fark =s.length()-s1.length();
        System.out.println("Basinda veya sonunda toplam " + fark +" adet bosluk vardir.");


        //12) Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
        //yazınız.
        //Örnek:‘Ali’ için kodunuz konsolda false yazdırmalıdır
        // ‘ali.’ için kodunuz konsolda false yazdırmalıdır
        // ‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
        // ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
        // ‘ALI.’ için kodunuz konsolda true yazdırmalıdır.



        String h ="Salih.";
        char firstch =h.charAt(0);
        char lastch =h.charAt(h.length()-1);
        boolean a =firstch>='A'&& firstch<='Z'&&lastch=='.';
        System.out.println(a);



        //Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        //Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
        //sembol olmalıdır.
        //Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
        // 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
        // '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
        // '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
        // '! a b 3 k' kodunuz konsolda false yazdırmalıdır.

        String keyword = "Asdfg123";
        int karakterSayisi =keyword.replace("[^ ]","").length();
        boolean karakterSayisiSonuc=karakterSayisi>7;
        boolean sembolSayisi = keyword.replaceAll("[0-9a-zA-Z]","").length()>0;
        boolean result= karakterSayisiSonuc&&sembolSayisi;
        System.out.println(sembolSayisi);
        System.out.println(result);




        //14) Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek
        //için kod yazınız
        //1.way
        String a ="Java";
        boolean d =a.contains("v");
        System.out.println(d);
        //2.way
        boolean f = a.length()-a.replace("v","").length()>0;
        System.out.println(f);

        //15) String gomlekFiyat = ‘$12.99’;
        //String kitapFiyat = ‘$35.99’;
        //Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.

        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";
        String gomlekFiyat1 =gomlekFiyat.replaceAll("[$.]","");
        String kitapFiyat1 =kitapFiyat.replaceAll("[$.]","");
        double gomlekFiyat2= Double.valueOf(gomlekFiyat1);
        double kitapFiyat2 =Double.valueOf(kitapFiyat1);
        double sonuc =(gomlekFiyat2+kitapFiyat2)/100;
        System.out.println(sonuc);


 */

        //Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
        //Not: İkinci isim kapsam dışındadır.
        //Örnek: Tom Hanks ==> TH, Mary Star ==> MS

        String name ="Esma Sönmez";
        char ad =name.charAt(0);
        char soyAd = name.split(" ")[1].charAt(0);
        System.out.println(" "+ad+soyAd);

        //Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
        String m ="ijfj.,!!?98";
        int ö = m.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(ö);
    }
}
