package Java_Tekrar_Cozum0929;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        /*
        Kullanicidan gun sayisini aliniz ve gun ismini ekrana yazdiriniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen gun no giriniz...");
        byte gunNo = input.nextByte();

        switch (gunNo) {
            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("carsamba");
                break;
            case 5:
                System.out.println("Persembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Gecerli gun sayisini giriniz...");
        }


    }
}
