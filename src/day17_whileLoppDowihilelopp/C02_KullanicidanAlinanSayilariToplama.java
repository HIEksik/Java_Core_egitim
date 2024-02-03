package day17_whileLoppDowihilelopp;

import java.util.Scanner;

public class C02_KullanicidanAlinanSayilariToplama {
    public static void main(String[] args) {
        // kullanıcıdan toplanmak üzere sayılar alın
        // toplam 500 ü geçerse " bukadar sayi yeter ... adet sayi girdiniz ... toplamıo ... oldu"
        // yazdırın ve işlemi bitirin


        Scanner scanner=new Scanner(System.in);

     int sayi=0;
     int toplam=0;
     int sayac=0;
     while (toplam<=500){

         System.out.println("Lütfen 500 olana kadar sayı giriniz ");
         sayi=scanner.nextInt();

         toplam+=sayi;
         sayac++;

     }

        System.out.println("Bukadar yeter "+sayac+" adet sayi girildi toplamı "+toplam );

    }
}
