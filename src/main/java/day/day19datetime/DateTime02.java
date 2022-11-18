package day.day19datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Example 1: Java'dan aldiginiz Date'i "ay/gun/yil" olarak yaziniz

        //Example 2: Java dan aldiginiz time'in formatini degistiriniz
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = dtf1.format(currentDate);
        System.out.println(formattedDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate3);

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formattedDate4 = dtf4.format(currentDate);
        System.out.println(formattedDate4);
    }
}
