package day.day15arraysmultidimensionalarrays;

import Java_Tekrar_Cozum0929.Switch01;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {


//Example 1: Size verilen pozitif ve negatif sayilar iceren bir integer array'deki "en buyuk negatif" ve
// "en kucuk pozitif" elemani bulunuz.
        int arr[] = { -12, 18, -5, 23, 0 };

        Arrays.sort(arr); //-12,-5,0,18,23
        
        int maxNegatif=arr[0];
        int minPozitif= arr[arr.length-1];

        for (int w:arr) {

            if(w<0){
                maxNegatif =Math.max(maxNegatif,w);

            } else if (w>0) {
                minPozitif=Math.min(minPozitif,w);

            }else {
                continue;
            }


        }

        System.out.println(maxNegatif);
        System.out.println(minPozitif);

        System.out.println();

        //Example 1: Bir String'deki sesli harflerin sayisini bulan kodu yaziniz
        //           a - e - i - o - u - A - E - I - O - U
        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        String[] str1=str.toLowerCase().split("");
        System.out.println(Arrays.toString(str1));
        int counter=0;
        for (String w:str1) {

            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                counter++;

            }


        }


        System.out.println(counter);



    }
}
