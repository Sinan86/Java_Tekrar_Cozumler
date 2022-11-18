package Java_Tekrar_Cozumler;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        // Kullanici gun numarasini girsin kod ismini yazsin

        Scanner input =new Scanner(System.in);
        System.out.println("Gün numarasini giriniz...");
        byte günNo = input.nextByte();
        if (günNo==1){
            System.out.println("Pazar");
        } else if (günNo==2) {
            System.out.println("Pazartesi");

        }else if (günNo==3) {
            System.out.println("Sali");

        }else if (günNo==4) {
            System.out.println("Carsamba");

        }else if (günNo==5) {
            System.out.println("Persembe");

        }else if (günNo==6) {
            System.out.println("Cuma");

        }else if (günNo==7) {
            System.out.println("Cumartesi");

        }else {
            System.out.println("Gecerli birgun giriniz...");
        }

    }
}
