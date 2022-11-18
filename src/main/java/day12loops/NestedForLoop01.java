package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {

        //Example 1: Asagidaki sekli ekrana yazdiran kodu yaziniz
        //          ****
        //          ****
        //          ****
//1. way
        /*Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz...");
        char ch = input.next().charAt(0);
        int i =1;
        while(i<4){

            int k=1;
            while (k<5) {

                System.out.print(ch);
                k++;

            }
            System.out.println();

           i++;
        }


       // 2.way
        Scanner input=new Scanner(System.in);
        System.out.println("Bir karakter giriniz...");
        char ch1 =input.next().charAt(0);

        for(int i = 1;i<5; i++){

            System.out.println();

            for (int k = 1; k<5; k++){
                System.out.print(ch1);
            }

        }

         /*
                Example 2: Asagidaki sekil cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */

/*
        for(int i = 1; i<6; i++){
            System.out.println("");
            for (int k =1;k<= i;k++){
                System.out.print(k+ " ");
            }
        }
        System.out.println();
        int i=1;

        while(i<6){
            int k=1;
            while (k<=i){
                System.out.print(k+" ");

                k++;

            }
            System.out.println();
            i++;

        }
        System.out.println();
/*
                Example 3: Asagidaki sekil cizen kodu yaziniz

                            * * * *
                            * * *
                            * *
                            *
                 */

        int row = 4;

        for (int a = 1; a <= row; a++) {
            for (int k = row; k >= a; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        double sayi = 24.5673;
        String str = String.valueOf(sayi);
        String str1 = str.split("\\.")[1];
        int a = Integer.valueOf(str1);
        int sum = 0;

        do {
            sum = sum + a % 10;
            a = a / 10;
        } while (a > 0);
        System.out.println("toplam =" + sum);

        System.out.println();


        int i = a;

        while (i > 0) {

            sum = sum + a % 10;

            i = i / 10;
        }
        System.out.println("sonuc ="+sum);
        System.out.println();

        for (int k=a;k>0;k=k/10){
            sum=sum+k%10;


        }
        System.out.println("result =" +sum);
    }
}





