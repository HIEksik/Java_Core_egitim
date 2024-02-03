package day29_immutableClases;

import java.time.LocalDate;

public class C06_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();

        LocalDate dogumtarihi=LocalDate.of(1989,10,7);

        System.out.println(tarih);// 2023-12-04

        System.out.println(tarih.plusWeeks(23));// 2024-05-13
        // 23 hafta sonra 2024 ün mayıs 13 ü olacakmış  // hafta olarak ileri gittik

        System.out.println(tarih.plusWeeks(3).plusYears(2).plusDays(5));
        // 2025-12-30 .plus ile ileri tarihe gidiyoruz

        // Geri tarihe gitmek minus...() ile tarihte geriye gidebiliriz

        System.out.println(tarih.minusYears(5).minusMonths(3).minusDays(8));
        // 2018-08-27

        // tarihin istedigimiz bir bölümünü istedigimiz deger ile degiştirebiliriz.
        // whit..() methodları ile

        System.out.println(tarih.withYear(2001));// 2001-12-04

        System.out.println(tarih.withDayOfYear(134));// 2023-05-14 yılın 134.üncü günü

        System.out.println(tarih.getDayOfYear());// yılın kaçıncı günü 338

        System.out.println(tarih.getDayOfWeek());// MONDAY

        System.out.println(tarih.getEra()); // CE

        System.out.println(tarih.lengthOfYear()); // bu senenin uzunlugu 365

        System.out.println(tarih.isLeapYear()); // false artık yılmı degil mi

        LocalDate leepYearKontrol=LocalDate.of(2040,1,1);

        System.out.println(leepYearKontrol.isLeapYear()); // true artık yılmış-- bir gün fazla

        System.out.println(tarih.isBefore(leepYearKontrol));// true // bu günün tarihi oluşturdugumuz  leep yıldan önce mi

        System.out.println(tarih.isAfter(leepYearKontrol));// false // bu  günün tarihi leep yıldan sonra mı
        System.out.println(tarih.isEqual(leepYearKontrol));// false // bu günün tarihi leep yıla eşit mi
        System.out.println(tarih.compareTo(dogumtarihi)); // 34  bilgisayar yılı ile doğum tarihi arasında toplam kaç yıl var
        System.out.println(tarih.compareTo(leepYearKontrol));// -17
        System.out.println(dogumtarihi.until(tarih)); // P34Y1M27D dogum tarihi kaç gün   34 yıl 1 ay 27 gün

        LocalDate beklenenTarih=LocalDate.of(2025,5,12);

        System.out.println(tarih.until(beklenenTarih));// P1Y5M8D bekledigimiz tarihe kaç gün kaldı


    }
}
