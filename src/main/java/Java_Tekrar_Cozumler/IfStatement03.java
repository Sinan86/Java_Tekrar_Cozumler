package Java_Tekrar_Cozumler;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        // Kullanicidan gun isimlerini aliniz hafta ici yada hafta sonu old. soyleyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Gün ismini giriniz....");
        String gun = input.next();

                if(gun.equalsIgnoreCase("Pazar")
                ||gun.equalsIgnoreCase("Cumartesi")) {
                    System.out.println("Hafta Sonu");

                }else if (gun.equalsIgnoreCase("Pazartesi") ||
                          gun.equalsIgnoreCase("Sali") ||
                          gun.equalsIgnoreCase("Carsamba")||
                          gun.equalsIgnoreCase("Persembe")||
                          gun.equalsIgnoreCase("Cuma")) {
                    System.out.println("Hafta Ici");


                } else {
                    System.out.println("Gecerli bir gun giriniz");

                }
    }
}
