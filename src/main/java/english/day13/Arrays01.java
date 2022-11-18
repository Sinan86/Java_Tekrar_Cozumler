package english.day13;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        // Create an integer array and print the sum of the first and the last elements on the console.
        int ages[]=new int[7];
        System.out.println(Arrays.toString(ages));
        ages[0]=12;
        ages[1]=23;
        ages[2]=34;
        ages[3]=145;
        ages[4]=156;
        ages[5]=67;
        ages[6]=78;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);

        // Create a double and find the sum of all elements
        //[1.2,2.3,5.0,4.51]

        double prices[]=new double[4];
        prices[0]=1.2;
        prices[1]=2.3;
        prices[2]=5;
        prices[3]=4.51;
        System.out.println(Arrays.toString(prices));
        double sum=0;
        for (double w:prices) {
            sum+=w;

        }
        System.out.println(sum);
    }
}
