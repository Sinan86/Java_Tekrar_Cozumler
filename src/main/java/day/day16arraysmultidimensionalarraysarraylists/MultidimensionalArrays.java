package day.day16arraysmultidimensionalarraysarraylists;

import java.util.Arrays;

public class MultidimensionalArrays {


    public static void main(String[] args) {

        //Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.
        int arr[][] = { {2, 5, 1}, {32, 75} };
        int top=0;
        for (int[] w:arr) {

            for (int k:w) {
                top+=k;
            }

        }
        System.out.println(top);

        //Bir multidimensional array'i normal array'e ceviren kodu yaziniz
        //{ {2, 5, 1}, {32, 75} } ==> { 2, 5, 1, 32, 75}
        int brr[][] = { {2, 5, 1}, {32, 75} };
        int sum=0;
        for (int[] w:brr) {
            sum+=w.length;

       }
        int idx = 0;
        int crr[] = new int[sum];
        for (int[] w:brr){
            for (int k:w) {
                crr[idx]=k;
                idx++;
            }
        }


        System.out.println(Arrays.toString(crr));
        System.out.println();

        // Bir multidimensional arraydeki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz.
        int drr[][] = { {2, 5, 1}, {83, 75} };
        int maxS=drr[0][0];
        int minS=drr[0][0];
        for (int[] w:drr) {
            for (int k:w) {

               minS=Math.min(minS,k);
               maxS=Math.max(maxS,k);

            }

        }
        System.out.println(minS);
        System.out.println(maxS);
    }
}
