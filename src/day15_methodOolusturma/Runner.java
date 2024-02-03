package day15_methodOolusturma;

import day16_methodOlusturma_methodOverloadin.C01_voidMethodOlusturma;
import slaytSorular_DataCasting.C15_MethodOlusturma;

public class Runner {
    public static void main(String[] args) {

        //Başka bir Class ta oluşturdugumuz methodu Class ın ismini yazazrak cagırıp kullana biliyoruz

       C02_AsalsayiMethodu.asalSayiMi(61);// asal
       C02_AsalsayiMethodu.asalSayiMi(83);// asal

        System.out.println(C03_TamBolenlerSayisi.pozitifTambolenSayisi(234564));//24
        System.out.println(C03_TamBolenlerSayisi.pozitifTambolenSayisi(61));//2

        System.out.println(C15_MethodOlusturma.IsimSoyisiIlkHarfBuyukYapma("halil","EKSİk"));

        // önce class adını yaz ( . ) Methodu çağır

        C01_voidMethodOlusturma.kisiBilgileriYazdir("halil","ibrahim","4242424242424242");

    }
}
