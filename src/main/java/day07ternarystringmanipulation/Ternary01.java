package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

//Example 1 : Bir sayinin pozitif olup olmadihini yaziniz.

        // 1.Way : if_else
/*
 int num =-26;
 if (num>0) {
     System.out.println("num = " + "Pozitif...");
 } else if (num<1) {
     System.out.println("num = " + "Pozitif degil...");

 }else {
     System.out.println("num="  +"Uygun deger girin...");
 }



        String a =num>0 ? "Pozitif" : "Pozitif Degil";
        System.out.println(a);


        int x =12;
        int y =-22;
        int kleinN =x>y ? y : x;
        System.out.println(kleinN);



        double a =-2235;
        double abs =a>0 ? a : a*-1;
        System.out.println(abs);

        System.out.println(Math.abs(a));


        int x=-10;
        int y=-9;


       Object islem =x>0 && y>0 || x<0 && y<0 ? x*y : "Islem yapamam";
        System.out.println(islem);

             int year = 1700;
            String lead = year%100==0 ? (year%400==0 ? "leap" : "leap degil") : (year%4 !=0 ?  "Leap degil" : "Leap");
        System.out.println(lead);



        String pwd = "i1234d229";
        String resurt =pwd.length()<8 ? (pwd.charAt(0)=='K' ? "Gecerli" : "Gecersiz"):
                                       (pwd.charAt(0)== 'i' ? "Gecerli" : "Gecersiz");
        System.out.println(resurt);
         */


        String psw = "Manisa12?";
        String resurt =psw.length()>7 ? psw.contains(" ") ?"Gecersiz":psw.charAt(0)=='M' ||psw.charAt(0)=='m' ?
                psw.charAt(psw.length()-1)=='?' ? "Gecerli" : "Gecersiz":"Gecersiz":"Gecersiz";

        System.out.println(resurt);
        }

        }





