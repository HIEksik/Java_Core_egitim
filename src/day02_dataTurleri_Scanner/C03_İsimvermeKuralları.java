package day02_dataTurleri_Scanner;

public class C03_İsimvermeKuralları {
    public static void main(String[] args) {

        int NOT = 23;
        int not = 54;
        int Not = 45;
        int noT = 65;

        // variable isimleri case sensitive ( buyuk-kucuk harf duyarlidir )

        System.out.println(NOT);// 23
        System.out.println(Not);// 45

        int abc3 = 45;

        // camelCase variable isimlerinde kullanılır

        int karneNotu = 65;

        String İsminIlkHarfi = "H";

        String ISMINIlKHARFI = "k";
        /*
            Eğer variable ismi birden fala kelimeden oljuşuyorsa
            ilk harf kucuk,
            sonraki kelimeler ise ilk harf buyuk, diger harfler kucuk yazilir
            buna camelCase denir

            Farkli sekilde yazilinca da Java kabul eder
            ama tum yazilimcilar tarafından ortak olarak belirlenen
            kullanım kurallarına uymak bizim tecrübemizi gösterir

         */

    }
}
