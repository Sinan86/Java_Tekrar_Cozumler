package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {

    // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
    //            [2, 3, 12, 0,  0,  0]
    public static void main(String[] args) {

        int sifirb[]={0, 2, 3, 0, 12, 0};
        int sifirs[]={0,0,0,0,0,0};
        int idx=0;

        for (int w:sifirb ) {

            if(w!=0){
                sifirs[idx]=w;
                idx++;
            }else{
                continue;
            }



    }
        System.out.println(Arrays.toString(sifirs));
        System.out.println();

        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
        //           [ 2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
        //                             ==> Kullanici 6'yi sordu ==> 6 array'de yok

        int arr[]={2,1,2,-3,2};
        Scanner input =new Scanner(System.in);
        System.out.println("Merak ettiginiz sayiyi giriniz...");
        int sayi =input.nextInt();
        int counter=0;
        for (int w:arr) {
            if(w==sayi) {
                counter++;

            }

            }if (counter>0){
            System.out.println(sayi + " array'de " + counter +" defa var...");

        }else {
            System.out.println(sayi + " array'de yok");
        }
        //Example 3
        //: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //           "Java kolaydir calisana, ne kolay ki calismayana." ==> calismayana

        String cümle= "Java kolaydir calisana, ne kolay ki calismayana.";
        String cümle1 =cümle.replaceAll("\\p{Punct}","");
        System.out.println(cümle1);
        String kelime[] =cümle1.split(" ");
        Arrays.sort(kelime, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(kelime));
        System.out.println(kelime[kelime.length-1]);


    }
}


