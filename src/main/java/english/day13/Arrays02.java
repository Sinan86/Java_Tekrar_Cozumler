package english.day13;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        // Create a String Array and print the elements in alphabetical order on to console in different lines.


        String cities[] = new String[]{"Tokyo", "Berlin", "Istanbul", "JaksonVille", "Calgary"};

        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));

        // Create a string Array and print the elements Whose lengt is less than 5

        String names[] = {"Ali", "Thomas", "Mark", "Jakson", "Tom", "Martin"};
        String str = "";
        for (String w : names) {

            if (w.length() < 5) {

                str += w + " ";
            }


        }
        System.out.print(str);


        //Create a String array and print the elements before "Tom".
        System.out.println();
        String student[] = {"Ali", "Aisha", "Janet", "Tom", "John"};
        for (String w : student) {
            if (!w.equalsIgnoreCase("Tom")) {
                System.out.print(" "+w);
            } else {
                break;
            }


        }

        // Create a String Array and print the elements different from"Tom"
        System.out.println();
        System.out.println("********************************************+");
        String employee[]={"Ali","Aisha","Janet","Tom","John","Michael","Susan"};
        for (String w:employee) {
            if (w.equals("Tom")){
                continue;//skip
            }

            System.out.print(w+" ");

        }

    }
}














