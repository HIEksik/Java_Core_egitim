package day30_timeDate_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);// 2023-12-04T01:38:54.245293600 // tarihi ve saati aynı anda görme

        /*
        Local date time objesi hem tarihi hemde saati bize getirir
        ANCAK tarih ve saati bizim istedigimiz foırmatta yazdırmaz

        Eger tarih ve /veya saati  istedigimiz bir formatta yazdırmak istersek
        DateTimeFormatter class ından yardım almalıyız

        örn 03-12-2023
        3 - aralık - 2023
        5 - Mar - 23
        17 / 03 / 2023

        FORMAT OLUSTURURKEN
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini


         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami


         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati
         a yazarsak AM veya PM degerini yazar


         */

        DateTimeFormatter istedigimFormat1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(tarihSaat.format(istedigimFormat1)); // 04-12-2023

        // saati 12 Mart 2023 Pazartesi 05 : 12 PM

        DateTimeFormatter istedigimFormat2=DateTimeFormatter.ofPattern("dd MMMM yy EEEE hh : mm a");

        System.out.println(tarihSaat.format(istedigimFormat2)); // 04 December 23 Monday 02 : 05 AM

        // 11/30/2023 1:35

        DateTimeFormatter istedigimFormat3=DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm");

        System.out.println(tarihSaat.format(istedigimFormat3)); // 12/04/2023 2:22


    }
}
