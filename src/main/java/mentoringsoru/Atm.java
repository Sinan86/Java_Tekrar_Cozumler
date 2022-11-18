package mentoringsoru;

import java.util.Scanner;

public class Atm {


    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Sifrenizi Giriniz");
    int bakiye = 3000;
    String sifre = input.nextLine();
    //String sifre = "abcd123-";
    boolean kural1 = sifre.length() > 7;
    boolean kural2 = !sifre.contains(" ");
    boolean kural3 = sifre.replaceAll("[^A-Z]","").length()==0 ;
    boolean kural4 = sifre.charAt(sifre.length() - 1) == '-';
    //System.out.println(kural1 && kural2 && kural3 && kural4);
    if (kural1 && kural2 && kural3 && kural4){
        System.out.println("Bakiye sorgula icin 1 e, \nPara yatirma icin 2 ye, \nPara çekmek icin 3 e," +
                "\nPara göndermek icin 4 e,\nSifre değiştirmek icin 5e  \nCikis icin 6 ya basiniz.. ");
    }else
        System.out.println("Yanlis sifre girdiniz");
    int islem = input.nextInt();
    switch (islem) {
        case 1:
            System.out.println("Bakiyeniz =" + bakiye);
            break;
        case 2 :
            System.out.println("Ne kadar yatiracaginizi girin");
            int yatirilanPara = input.nextInt();
            bakiye+=yatirilanPara;
            System.out.println("Bakiyeniz = " + bakiye);
            break;
        case 3 :
            System.out.println("Ne kadar cekmek istediginizi giriniz");
            int cekilicekPara = input.nextInt();
            if (cekilicekPara > bakiye){
                System.out.println("Yetersiz Bakiye");
            }else if (cekilicekPara < bakiye){
                bakiye = bakiye-cekilicekPara;
                System.out.println("Bakiyeniz = " + bakiye);
                break;
            }
        case 5 :
            System.out.println("Yeni Sifrenizi Giriniz");
            String yeniSifre=input.nextLine();
            sifre= yeniSifre;
            System.out.println("Yeni sifre");
            System.out.println("Sifreniz basariyla kaydedildi");
            break;
        case 6 :
            System.out.println("Gule Gule");
            break;
        default:
            System.out.println("Geceriz Sayi Girdiniz");
    }
}
}