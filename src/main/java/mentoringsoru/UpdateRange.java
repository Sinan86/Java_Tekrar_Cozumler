package mentoringsoru;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateRange {

    /*
    Update a method uRange
    parameters are int array and two ints
    if the int array has a number between the two int change it to -1
    for Example
    int array = 1,6,12,15,22,18,30,16
    int 1 = 10
    int 2 = 20
    result should be 1,6,-1,-1,22,-1,30,-1
     */
   /*
        UpdateRange
   URange isminde bir metod yazınız,
   Bu metod parametre olarak int Array ve 2 adet int almalı.
   Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
   rakamlar arasında olanlarına -1 değerini atasın.oluşan yeni diziyi göndersin.main de yazdırınız.

    */

    public static void main(String[] args) {
        int[] arr = {1, 6, 12, 15, 22, 18, 30, 16};

        Scanner input =new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz...");
        int ilkSayi =input.nextInt();
        System.out.println("Ikinci sayiyi giriniz...");
        int ikinciSayi=input.nextInt();
        updateRange(arr,ilkSayi,ikinciSayi);
    }

    private static void updateRange(int[] arr, int ilkSayi, int ikinciSayi) {

        for (int i = 0; i <arr.length ; i++) {

            if(ikinciSayi>ilkSayi){
                if (arr[i]>ilkSayi&&arr[i]<ikinciSayi){
                  arr[i]=-1;

                }
            } else if (ilkSayi>ikinciSayi) {
                if (arr[i]>ikinciSayi&&arr[i]<ilkSayi){
                    arr[i]=-1;
                }

            }
        }
        System.out.println(Arrays.toString(arr));


    }


}
