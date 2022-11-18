package Java_Tekrar_Cozum0929;

import java.util.Scanner;

public class T03_C02_Ascii {
    public static void main(String[] args) {

        System.out.println(' ' + 0);
        char harf1 ='a';
        char harf2 ='A';
        System.out.println("harf1>harf2 ==>" + (harf1>harf2));


        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen yasinizi giriniz");
        int yas = input.nextInt();
        if (yas<5) {
            System.out.println("Baby");
        } else if (yas<13) {
            System.out.println("child");


        } else if ( yas<21) {
            System.out.println("teenager");

        } else if (yas<31) {
            System.out.println("adult");

        }else {
            System.out.println("Tanim araligi disinda");

        }

/*
        Password un ilk harfi buyuk harf ise
        'A' olursa gecerli password aksi halde gecersiz password.
        Password un ilk harfi kucuk harf ise
        'z' olursa gecerli password aksi halde gecersiz password.
         */
// note Java nested kodlari calistiriken cok zaman harcar, buna "Time Complexity" denir.
        // Buyuzden "nested kod" yazmamaya calisiriz.

       String pwd = "Axy12";
       if(pwd.charAt(0)>= 'A' && pwd.charAt(0)<='Z') {

           if (pwd.charAt(0) == 'A') {
               System.out.println("Gecerli Password");
           } else {
               System.out.println("Gecersiz Password");

           }
       } else if(pwd.charAt(0)>'Z'){
               if (pwd.charAt(0) == 'z'){
                   System.out.println("Gecerli Password");
               }else {
                   System.out.println("Gecersiz Password");
               }


           }

       }

    }

