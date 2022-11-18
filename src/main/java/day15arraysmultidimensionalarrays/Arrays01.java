package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {



    int arr[] = {12, 31, 43, 14 };

    int sayi1 = 43;

    Arrays.sort(arr);
    int idx1=Arrays.binarySearch(arr,sayi1);
        System.out.println(idx1);

int[][] brr={{1,2},{4,5},{6,7,8,9}};
int a= brr.length;
        System.out.println(a);


    }
}
