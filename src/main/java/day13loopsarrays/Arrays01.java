package day13loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
        int stdAges[] = new int[7];
        System.out.println(Arrays.toString(stdAges));

        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;
        System.out.println(Arrays.toString(stdAges));
        Arrays.sort(stdAges);
        int ilk =stdAges[0];
        int Son =stdAges[stdAges.length-1];
        System.out.println(ilk+Son);
        int sum=0;
        {
            {
                for (int i = 0; i < stdAges.length; i++) {

                    sum = sum + stdAges[i];
                }
                System.out.println(sum);
            }
        }
        int top=0;
        int k =0;
        while(k<stdAges.length){

            top=top+stdAges[k];

            k++;
        }
        System.out.println(sum);


        int top1=0;
        int n=0;
        do {
            top1 = top1 + stdAges[n];
            n++;
        }while (n<stdAges.length);
        System.out.println(top1);
        int t=0;
        for(int w : stdAges){
        t=t+w;
        }
        System.out.println(t);

        String str[] =new String[5];
        str[0]="Ali";
        str[1]="Tom";
        str[2]="Veli";
        str[3]="Kemal";
        str[4]="Cem";


        int s =0;

        for(int i=0;i< str.length;i++){

            s=s+ str[i].length();

        }
        System.out.println(s);
        System.out.println("***************************************************");
       int m=0;
        for (String w:str) {
            m=m+w.length();


        }
        System.out.println(m);


        char ch[]={'A','c','D','k','m'};
        for (char w:ch ) {
            if (w>='A'&&w<='Z') {
                System.out.print(w);
            }



        }

    }
    }

