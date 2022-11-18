package javaSoruCozumlerim;

public class For_Loop3 {
    public static void main(String[] args) {

        //7) Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        int sayi=3;
        for (int i = 1; i < 11; i++) {
            int result=sayi*i;
            System.out.print("3"+ "*"+i+"="+result+" ");
        }
        int num=4;
        int k=1;
        do{
            int result1=num*k;
            k++;
            System.out.print(" "+num+"*"+k+"="+result1);
        }while (k<11);
        System.out.println();



//8) 20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
//bırakarak yazdırmak için gereken kodu yazınız
            String oddNum ="";
        for (int i = 20; i >3; i--) {
            if(i%2!=0){
               // oddNum+=" "+i;  oddnum=oddnum + i

                System.out.print(" "+i);

            }

        }
        //System.out.println();
        // System.out.println(oddNum);

        //9) String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 'Ali Can?' ==> l*i*a*n*
        System.out.println();
        String name="Sinan Sönmez";
        String str ="";
        for (int i = 0; i <name.length(); i++) {
            String firstLetter =name.substring(i,i+1);
            char ch =firstLetter.charAt(0);
            if(ch<97){
                str+=ch;

            } else if (ch==' ') {
                str+=ch;

            } else {
                str+="*";
            }
        }
        System.out.println(str);




    }
}
