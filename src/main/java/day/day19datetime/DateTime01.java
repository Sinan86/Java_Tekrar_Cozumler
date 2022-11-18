package day.day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
//Example 1: "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
//Example 2: "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalTime curruntTime = LocalTime.now();
        System.out.println(curruntTime);

        //Example 3: "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        //Example 4: Japonya'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz#
        LocalDateTime currentDateTimeJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeJapan);
        //Example 5: Istanbul'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeIstanbul);
        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate current1Date = LocalDate.of(2002, 10, 21);
        LocalDate retireDate = LocalDate.now().plusDays(789);
        System.out.println(retireDate);

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate alpTahaDateBorn = LocalDate.of(2014, 12, 03);
        LocalDate zumraDateBorn = LocalDate.of(2018, 8, 30);
        Long diff = ChronoUnit.DAYS.between(alpTahaDateBorn, zumraDateBorn);
        System.out.println(diff);
        //Example 8: Istanbul'un Fethi ile, Cumhuriyet'in kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
        //           29 Mayis 1453 ==> Istanbul'un Fethi              29 Ekim 1923 ==> Cumhuriyet'in kurulusu
        LocalDate istanbulFethi = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyetTarihi = LocalDate.of(1923, 10, 29);
        Long diff1 = ChronoUnit.MONTHS.between(istanbulFethi, cumhuriyetTarihi);
        System.out.println(diff1);
        //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate sinanDateBorn = LocalDate.of(1986, 7, 5);
        int day = sinanDateBorn.getDayOfMonth();
        int month = sinanDateBorn.getMonthValue();
        if (20 < day && month == 3 || day < 21 && month == 4) {
            System.out.println("koc");
        }
        if (20 < day && month == 4 || day < 21 && month == 5) {
            System.out.println("boga");
        }
        if (20 < day && month == 5 || day < 21 && month == 6) {
            System.out.println("ikizler");
        }
        if (20 < day && month == 6 || day < 21 && month == 7) {
            System.out.println("Yengec");
        }
        if (20 < day && month == 7 || day < 21 && month == 8) {
            System.out.println("Aslan");
        }
        if (20 < day && month == 8 || day < 21 && month == 9) {
            System.out.println("basak");
        }
        if (20 < day && month == 9 || day < 21 && month == 10) {
            System.out.println("terazi");
        }
        if (20 < day && month == 10 || day < 21 && month == 11) {
            System.out.println("Akrep");
        }
        if (20 < day && month == 11 || day < 21 && month == 12) {
            System.out.println("Yay");
        }
        if (20 < day && month == 12 || day < 21 && month == 1) {
            System.out.println("oglak");
        }
        if (20 < day && month == 1 || day < 21 && month == 2) {
            System.out.println("kova");
        }
    }
}
