package day.day19datetime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {
        //Example 1: Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayan kodu yaziniz
        LocalTime currentTimeJapan =LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime currentTimeMainz =LocalTime.now(ZoneId.of("Europe/Berlin "));
        long diff =ChronoUnit.HOURS.between(currentTimeMainz,currentTimeJapan);
        System.out.println(diff);


        //Example 2: Sabit bir tarih olusturunuz

        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"
    }
}
