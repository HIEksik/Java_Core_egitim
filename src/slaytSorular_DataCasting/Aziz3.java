package slaytSorular_DataCasting;

import java.util.Scanner;

public class Aziz3 {
    public static void main(String[] args) {

        // kullanıcıdan bir şehir ismi isteyin ( istanbul, adana, ankara, diyarbakır, hatay, sivas)
        // girilen şekir istanbul ise kullanıcıya otobüs kartınız var mı diye sorun
        // eğer otobüs kartı varsa %15 indirim yapın, yoksa yapmayın direkt fiyatı yazdırın
        // girilen şekir adana ise kullanıcıya otobüs kartınız var mı diye sorun
        // eğer otobüs kartı varsa %20 indirim yapın, yoksa yapmayın direkt fiyatı yazdırın
        // girilen şekir ankara ise kullanıcıya otobüs kartınız var mı diye sorun
        // eğer otobüs kartı varsa %30 indirim yapın, yoksa yapmayın direkt fiyatı yazdırın
        // girilen şekir diyarbakır ise kullanıcıya otobüs kartınız var mı diye sorun
        // eğer otobüs kartı varsa %10 indirim yapın, yoksa yapmayın direkt fiyatı yazdırın
        // girilen şekir hatay ise kullanıcıya otobüs kartınız var mı diye sorun
        // eğer otobüs kartı varsa %50 indirim yapın, yoksa yapmayın direkt fiyatı yazdırın
        // girilen şekir sivas ise kullanıcıya "sivasa gidilirmi lan" yazdırın

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen şehir giriniz :");

        String sehir=scanner.nextLine();

        System.out.println("Otobus katınız varmı Evet : E  Hahır : H");
        char kart=scanner.next().charAt(0);


        if (kart=='E'){

            if (sehir.equalsIgnoreCase("İstanbul")){
                System.out.println("%15 indirim yapıldı");
            } else if (sehir.equalsIgnoreCase("Adana")) {
                System.out.println("%20 indirim yapıldı");

            }else if (sehir.equalsIgnoreCase("Ankara")){
                System.out.println("%30 indirim yapıldı ");
            } else if (sehir.equalsIgnoreCase("Diyarbakır")) {
                System.out.println("%10 indirim yapıldı");
            } else if (sehir.equalsIgnoreCase("Hatay")) {
                System.out.println("%50 indirim yapıldı");
            } else if (sehir.equalsIgnoreCase("Sivas")) {
                System.out.println("Sivasa gilirmi lan");
            }


        } else if (kart=='H') {

            if (sehir.equalsIgnoreCase("İstanbul")){
                System.out.println("Standart fiyat");
            } else if (sehir.equalsIgnoreCase("Adana")) {
                System.out.println("Standart fiyat");

            }else if (sehir.equalsIgnoreCase("Ankara")){
                System.out.println("Standart fiyat");
            } else if (sehir.equalsIgnoreCase("Diyarbakır")) {
                System.out.println("Standart fiyat");
            } else if (sehir.equalsIgnoreCase("Hatay")) {
                System.out.println("Standart fiyat");
            } else if (sehir.equalsIgnoreCase("Sivas")) {
                System.out.println("Sivas a Gidilirmi Lan");
            }

        }else {
            System.out.println("Yanlış Giriş Yaptınız");
        }


    }
}
