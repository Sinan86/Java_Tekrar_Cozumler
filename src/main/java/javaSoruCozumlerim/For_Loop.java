package javaSoruCozumlerim;

import java.util.Arrays;

public class For_Loop {
    //1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
    //ardışık tam sayı arasında boşluk bırakarak yazınız

    public static void main(String[] args) {
     /*   String a="";
        for (int i = 120; i >11; i--) {

            if(i%4==0&&i%6==0){
                a=a+" "+i;//a+=i==>a=a+i  a-=i==> a=a-i
                System.out.print(" "+i);

            }


        }
        System.out.println();
        System.out.print("4 ve 6 ya bölünebilen sayilar"+a);


        String b = "";
        int i = 120;
        while (i > 11) {


            if (i % 4 == 0 && i % 6 == 0) {
                b = b + " " + i;

            }
            i--;// i=i-1

        }
        System.out.println(b);



        String c = "";
        int k = 120;
        do {
            if (k % 4 == 0 && k % 6 == 0) {
                c = c + " " + k;
            }
            k--;
        } while (k > 11);
        System.out.println(c);


        //2) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //       Örneğin; accessories ´ ces

        String str = "accessories";
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);
            if (str.indexOf(s) != str.lastIndexOf(s)) {
                if (!str1.contains(s)) {
                    str1 += s;
                }
            }


        }
        System.out.println(str1);


        int i = 0;
        do {
            String s = str.substring(i, i + 1);
            if (str.indexOf(s) != str.lastIndexOf(s)) {
                if (!str1.contains(s)) {
                    str1 += s;
                }
            }
            i++;
        } while (i < str1.length());
        System.out.println("str1 = " + str1);

        int j = 0;
        while (j < str.length()) {
            String s = str.substring(i, i + 1);
            if (str.indexOf(s) != str.lastIndexOf(s)) {
                if (!str1.contains(s)) {
                    str1 += s;

                }
            }
            j++;
        }

      */

        //3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır


        String a = "1234554321";
        String b = "";
       /* for (int i = a.length() - 1; i >= 0; i--) {
            b += a.substring(i, i + 1);

        }
        System.out.println(b);
        if (a.equals(b)) {
            System.out.println("Polindromdur");
        } else {
            System.out.println("Polindrom degil");
        }



        int i = a.length() - 1;
        do {
            b += a.substring(i, i + 1);
            i--;
        } while (i >= 0);
        if (a.equals(b)) {
            System.out.println("Polindromdur");
        } else {
            System.out.println("Polindrom degil");

        }



        int i = a.length() - 1;//for (int i = a.length() - 1; i >= 0; i--)
        while (i >= 0) {

            b += a.substring(i, i + 1);

            i--;
        }
        if (a.equals(b)) {
            System.out.println("Polindromdur");
        } else {
            System.out.println("Polindrom degil");

        }
        //4) Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //Örnek; 223878 ´ 37


        */
        String q = "223878";
        String w = "";
        for (int j = 0; j < q.length(); j++) {
            String z = q.substring(j, j + 1);
            if (q.indexOf(z) != q.lastIndexOf(z)) {
                continue;
            } else {
                w += z;
            }
        }
        System.out.println(w);


        String t = "223878";
        String v = "";
        int y=0;
        do{
            String z = t.substring(y, y + 1);
            if (t.indexOf(z) != t.lastIndexOf(z)) {
            } else {
                v += z;
            }
               y++;
        }while (y<t.length());


        System.out.println(v);

        String h = "";
        int g=0;
        while (g<q.length()){

            String z = t.substring(g, g + 1);
            if (t.indexOf(z) != t.lastIndexOf(z)) {
            } else {
                h += z;
            }

            g++;
        }
        System.out.println(h);
    }
}



