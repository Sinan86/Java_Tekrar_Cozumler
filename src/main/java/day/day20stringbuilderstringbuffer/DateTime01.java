package day.day20stringbuilderstringbuffer;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DateTime01 {

    public static void main(String[]args){
    LocalDate tomBorn =LocalDate.of(2011,11,18);
    LocalDate aliBorn=tomBorn.minusYears(3).minusMonths(11).minusDays(13);

    LocalDate veliBorn=aliBorn.plusYears(1).plusDays(15);

        System.out.println(aliBorn);
        System.out.println(veliBorn);


}
}
