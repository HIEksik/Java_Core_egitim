package day08_nestedIfElseStatement;

import java.util.Scanner;

public class C02_nestedIfElseindirimliurunSorusu {
    public static void main(String[] args) {
        // Kullanicidan aldigi urun adedi ve  liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen ürün adedini giriniz :");
        int urunAdedi=scanner.nextInt();

        System.out.println("Lütfen liste fiyatını yazın :");
        double indirimsizFiyat=scanner.nextDouble();

        System.out.println("Müşteri kartınız varmı  : E evet  .. H hayır " );
        char kartVarmi=scanner.next().toUpperCase().charAt(0);

        double indirimOrani=0;


        /*
        İf else ile soru çözerken degişken sayısı birden fazla ise
        İç içe if else cumleleri kullana biliriz.

        önce değişkenlerden birini asıl değişken seçip yapıyı ona göre kuralım.

        bu class ta müşteri kartı Asıl değişken olsun

        Kart bilgisine göre üç ihtimali yazdıktan sonra her ihtimali içine bu defa ürün miktarına göre if else yazalım

         */

        if (kartVarmi=='E'){
            // Müşterinin kartı var

        if (urunAdedi>10){

            indirimOrani=20;
        } else if (urunAdedi>0) {
            indirimOrani=15;
        }else {
            System.out.println("Ürün Adedi Hatalı...");
        }

        } else if (kartVarmi=='H') {
            // müşterinin kartı yok

            if (urunAdedi>10){

                indirimOrani=15;
            } else if (urunAdedi>0) {

                indirimOrani=10;

            }else {
                System.out.println("Ürümn miktarı hatalı...");
            }

        }else {
            System.out.println("Kart bilgisi hatalı ...");
        }

        if (indirimOrani>0){

            System.out.println(indirimOrani+ " İndirimli toplam fiyat : "+ indirimsizFiyat*urunAdedi*(100-indirimOrani)/100);
        }

    }
}
