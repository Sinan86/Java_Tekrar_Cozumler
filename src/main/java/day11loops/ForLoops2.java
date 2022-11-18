package day11loops;

public class ForLoops2 {
    public static void main(String[] args) {

        //Bir String deki "m" karakteri haric tum karakterleri yazdiriniz.
        //Andromeda ==> Andreoda

        String str = "marmelade";

        String sonuc = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'm') {
                sonuc = sonuc + c;
            }
        }
        System.out.print(sonuc);
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'm') {
                continue;
            }
            System.out.print(c);
        }
        System.out.println();


            //Example 2 1' den 100' e kadar 6 ile bolunebilen sayilar haric yazdiriniz.

            for(int k=1; k<101;k++){
                if(k%6==0){
                    continue;
                }
                System.out.print(k+" ");

            }
        System.out.println();
            //Example 3 Size verilen bir String deki 'm' den onceki karakterleri yazdiriniz.
            //          Luxemburg ==>Luxe

        String s = "Luxemburg";


            for (int i =0;i<s.length();i++){
                char c=s.charAt(i);


                if(c=='m'){
                    break;

                }
                System.out.print(c);

            }



        }
    }

