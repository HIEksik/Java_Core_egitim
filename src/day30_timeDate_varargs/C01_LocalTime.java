package day30_timeDate_varargs;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalUnit;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();

        // Farklı ülkelerin saatini bulma

        LocalTime saatUsa=LocalTime.now(ZoneId.of("America/New_York"));

        System.out.println("New york saati : "+saatUsa); // New york saati : 17:14:36.529274500

        System.out.println(saat.plusHours(10000));// 100000 saat sonra sat kaç 17:18:31.463657600

        System.out.println(saat.minusHours(3).minusSeconds(23).minusMinutes(15));
        //22:04:21.836307400  bulundugun saatten önceki saate gitmek

        System.out.println(saat.withMinute(27).withSecond(15));// bulundugun saati geri  bir saate almak 01:27:15.006119200

        System.out.println(saat.withSecond(0).withNano(0));// saat ve dakika olarak yazdırmak  01:25


        // plus ileriye doğru , minus geriye doğru ,, whit  şu andaki saati istedigimiz degerlerle veriyor

        System.out.println(saat.toNanoOfDay()); // 5298867658000
        // gece 00 dan başlayarak saatin oluşturuldugu ana kadar geçen nanosaniye

        System.out.println(saat.toSecondOfDay()); // 5387 saniye olarak veriyor nano gibi

        LocalTime saat1=LocalTime.of(10,45);
        LocalTime saat2=LocalTime.of(14,12,36);

        System.out.println(saat1.isBefore(saat2));// true // saat1 saat2 den önce mi // kendi oluşturdugumuz zamanda hangisi önce gelir
        System.out.println(saat1.isAfter(saat2));// false




    }
}
