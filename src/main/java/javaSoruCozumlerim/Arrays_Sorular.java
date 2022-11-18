package javaSoruCozumlerim;

import java.util.Arrays;

public class Arrays_Sorular {
    public static void main(String[] args) {

//1) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
//Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
// (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10

      /*  int[] arr1 =new int[]{12,20,4,6,8,14,10,16};
        Arrays.sort(arr1);

        if(arr1.length%2!=0){
            System.out.println("ortadaki eleman = "+ arr1[arr1.length/2]);
        }else {
            System.out.println((arr1[arr1.length/2-1]+arr1[arr1.length/2])/2);
        }

        //2) String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        //Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        String[] arr2 =new String[]{"Kemal","Jonathan","Mark","Angie","Veli"};
        int enKisaKelime= arr2[0].length();
        for (String w:arr2) {
            enKisaKelime=Math.min(enKisaKelime,w.length());

                }
        for (String k:arr2) {
            if(k.length()==enKisaKelime){

                System.out.println("Uzunlugu en kisa olan kelime "+k);
            }


        }

       */

    //3) Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        //bulunuz.
        //Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

        int[] arr3 =new int[] { -12, 18, -5, 23, -2};
        Arrays.sort(arr3);
        int negativeArr3[]=new int[3];
        int positiveArr3[]=new int[2];
        int idx=0;
        int idy=0;
        for (int w=0; w<arr3.length; w++) {
            if(arr3[w]<0){

                negativeArr3[idx]=arr3[w];
                idx++;

            }else{
                positiveArr3[idy]=arr3[w];
                idy++;
            }
        }
        System.out.println(Arrays.toString(negativeArr3));
        System.out.println(Arrays.toString(positiveArr3));

        Arrays.sort(negativeArr3);
        Arrays.sort(positiveArr3);
        System.out.println("en büyük negative eleman : "+negativeArr3[negativeArr3.length-1]);
        System.out.println("en kücük pozitif eleman : "+positiveArr3[0]);


       // 2.way
        int negativeMaxDeg=arr3[0];
        int positiveMaxDeg=arr3[arr3.length-1];
        for (int w:arr3) {
            if (w<0){
                negativeMaxDeg=Math.max(negativeMaxDeg,w);
            } else if (w>0) {
                positiveMaxDeg=Math.min(positiveMaxDeg,w);
            }else {
                continue;
            }

        }
        System.out.println(negativeMaxDeg);
        System.out.println(positiveMaxDeg);

        //4) String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        //alınız.
        //Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM

        String []str =new String[]{"Kemal", "Jonathan", "Mark", "Jackson","Ali" };
        String strs ="";
        for (String w:str) {
            if (w.endsWith("n")||w.endsWith("k")) {
                strs += w.substring(0, 1);

            }
        }
        System.out.println(strs);

        //5) String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        //Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

        String[] brr = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int sum=0;
        for (String w:brr) {
            sum+=w.length();
        }
        System.out.println(sum);

        //6) Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.

        String s = "Apex is an object oriented programming language";
        String []crr=s.split("");
        int countainer=0;
        for (String w:crr) {
            if (w.equalsIgnoreCase("a")){
                countainer++;
            }

        }
        System.out.println(countainer);

        //7) Verilen bir String'deki sesli harf sayısını bulunuz.

        String e = "Apex is an object oriented programming language";
        String []drr=e.toLowerCase().split("");
        int counter=0;
        for (String w:drr ) {
            switch(w){
                case "a":
                case "e":
                case "i":
                case "u":
                case "o":
                    counter++;
            }
        }
        System.out.println(counter);

       // 8) İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız

        String[] frr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        String yeniÖgeler = "";
        for (String w:frr) {
            if(w.substring(0,1).equalsIgnoreCase(w.substring(w.length()-1))){
                yeniÖgeler+=" "+w;
            }

        }System.out.println(yeniÖgeler);
    }


}
