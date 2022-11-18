package Java_Tekrar_Cozum0929;

import java.util.Scanner;

public class T03_IfStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("iscinin isi bitirme suresini giriniz =");
        double bitirme = input.nextDouble();
        System.out.println("Isci sayisini giriniz =");
        double iscis =input.nextDouble();
        double bitirmesuresi =bitirme/iscis;
        System.out.println(" isin bitme suresi =" + bitirmesuresi);
    }

}
