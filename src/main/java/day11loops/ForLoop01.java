package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: 3 den 6 a kadar tamsayilarin toplamini bulan kodu yaziniz...

        int sum = 0;
        for (int i = 3; i < 7; i++) {
            sum = sum + i;

        }
        //Note : Systemoutprintln (sum) loop un disina yazilirsa son degerini ekrana yazdirir.
        // sout(sum); loop un icine yazilirsa her bir loop icin "sum" in hangi degerleri aldigini yazdirir.

        System.out.println(sum);
        System.out.println();
// Example 2 : 6 dan 3 e kadar tamsayilarin carpimini olusturunuz.
        int multiply = 1;
        for (int i = 6; i > 2; i--) {
            multiply = multiply * i;
        }
        System.out.println(multiply);

        // Example 3 : Size verilen bir tamsayinin rakamlari toplamini bulunuz.
        int sum1=0;
        int num=345;
        num =Math.abs(num);
        for (int i=num;i>0;i=i/10){
            sum1=sum1+i%10;
        }

        System.out.println(sum1);

        // Example 4: Size verilen bir String i ters ceviren kodu yaziniz.
        //Kaba ==> abaK

        String str ="Kaba";
        String ters="";
        for (int i=str.length()-1;i>-1;i--){
            char c=str.charAt(i);
            ters=ters+c;

        }
        System.out.print(ters);



    }



}
