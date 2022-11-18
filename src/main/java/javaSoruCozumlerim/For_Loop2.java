package javaSoruCozumlerim;

public class For_Loop2 {
    public static void main(String[] args) {

        //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A
        //A A A A A
        //A A A A A

        int column=3;
        int row=5;

        for (int i = 0; i <column ; i++) {
            for (int j = 0; j <row; j++) {
                System.out.print("A ");

            }


            System.out.println();

        }
     //6) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A
        //A A
        //A A A
        //A A A A

        for (int i=1;i<=5;i++){
            String s="";
            for(int j=1;j<=i;j++){

                s+="A ";
            }
            System.out.println(s);




        }

        //20) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //* * * * * *
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*

        for (int i = 1; i <=6; i++) {
            String asterisk="";
            for (int k=7-i;k>0;k--){
                asterisk+="* ";
            }



            System.out.println(asterisk);
        }

    }
}
