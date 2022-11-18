package javaSoruCozumlerim;

public class Type_Casting {

    public static void main(String[] args) {

        //1) Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.

        short s =123;
        int i = s;

        //2) Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.

        long l =12345L;
        int i1= (int)l;

        //3) Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz

        double d = 123.45;
        float f = (float)d;


        //4)Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
        //Sonrasında bu short değişkenin değerini konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır

        double d1 =123.45;
        short s1 =(short) d1;
        System.out.println("s1 = " + s1);

        //5) Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
        //Sonrasında bu double değişkenin değerini konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.

        byte b=23;
        double d2= b;
        System.out.println("d2 = " + d2);








    }

}
