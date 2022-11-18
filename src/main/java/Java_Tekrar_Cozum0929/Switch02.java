package Java_Tekrar_Cozum0929;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*Kullaniciya ay ismini sorunuz kullanicinin verdigi ay isminden son aya kadar ekrana yazdiriniz.

         */

        //Note  toLowerCase bir string deki tum karakterleri kucuk harfe cevirir.
        //Note  toUpperCase bir string deki tum karakterleri buyuk harfe cevirir.


        Scanner input= new Scanner(System.in);
        System.out.println("Bir ay ismi giriniz...");
        String ay = input.next().toLowerCase();

        switch (ay) {

            case "ocak":
                System.out.println("ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayis":
                System.out.println("mayis");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "agustos":
                System.out.println("agustos");
            case "eylul":
                System.out.println("eylul");
            case "ekim":
                System.out.println("ekim");
            case "kasim":
                System.out.println("kasim");
            case "aralik":
                System.out.println("aralik");
                break;
            default:
                System.out.println("gecerli ay ismi giriniz");
        }
    }
}
