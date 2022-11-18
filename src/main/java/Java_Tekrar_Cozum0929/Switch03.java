package Java_Tekrar_Cozum0929;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        // Switch de sadece int, byte,short,char,string data tipleri kullanilabilir.
        // eger 3 ten fazla durum varsa switch tercih ederim.
        //Kullanicidan islem ve 2 tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinasi yapiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Islemi giriniz +, - * /");
        char islem = input.next().charAt(0);
        System.out.println("Iki sayi giriniz...");
        double ilkS = input.nextInt();
        double ikinciS= input.nextInt();

        switch(islem){
            case '+':
                double top =ilkS+ikinciS;
                System.out.println("top = " + top);
                break;
            case '-' :
                double cik =ilkS-ikinciS;
                System.out.println("cik = " + cik);
                break;
            case '*':
                double carp =ilkS*ikinciS;
                System.out.println("carp = " + carp);
                break;
            case '/':
                double bol =ilkS/ikinciS;
                System.out.println("bol = " + bol);
                break;
            default:
                System.out.println("gecerli bir sayi giriniz...");
        }



    }


}
