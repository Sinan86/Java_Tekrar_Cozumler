package day.day16arraysmultidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        //Example 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz

        //[21, 50, 23, 200, 18, 20, 23, 185]

        List<Integer>num1=new ArrayList<>();
        List<Integer>sonuc=new ArrayList<>();
        num1.add(21);
        num1.add(50);
        num1.add(23);
        num1.add(185);
        num1.add(18);
        num1.add(20);
        num1.add(23);
        num1.add(200);
        System.out.println(num1);

        for (int w:num1) {
            if(w%2==0){
                sonuc.add(w);
            }else {
                sonuc.add(w+11);
            }

        }
        System.out.println(sonuc);





    }
}
