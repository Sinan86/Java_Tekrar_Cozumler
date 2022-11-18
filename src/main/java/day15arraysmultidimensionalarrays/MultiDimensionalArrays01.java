package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {

        //Example 1: String bir Multidimesional Array olusturunuz.
        //           Elemanlari ekleyiniz
        //           Toplam eleman sayisini ekrana yazdiran kodu yaziniz

        String[][] arr = new String[3][2];
        arr[0][0]="1";
        arr[0][1]="2";
        arr[1][0]="3";
        arr[1][1]="4";
        arr[2][0]="5";
        arr[2][1]="6";

        System.out.println(Arrays.deepToString(arr));

        String[][] brr={{"a","2","b"},{"Q","W","z"}};

    }
}
