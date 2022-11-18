package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //Example 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz

        String arr[]={"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        String t="";
        for (String w:   arr          ) {

            t=t+w+" ";
            if(w.equals("Tom")) {
                break;

            }



            }
        System.out.println(t);

        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
        String brr[]={"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        String p ="";
        for (String w:arr ) {

            if (w.equals("Tom")||w.equals("Jane")){
                continue;




            }p = w + " " + p;
        } System.out.println(p);

        System.out.println();

        //Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )

        Scanner input = new Scanner(System.in);
        System.out.println("Ogrenci sayisini giriniz...");
        int öSayisi =input.nextInt();
        System.out.println("Ögrenci isimlerini giriniz...");
        String names[]=new String[öSayisi];
        for (int i=1;i<=öSayisi;i++) {
            System.out.println("Lütfen"+i+". ögrenci ismini giriniz");
           // String stdname =
            //names[i-1]= stdname;
            names[i-1]=input.next();

        } System.out.println(Arrays.toString(names));


        }



    }
