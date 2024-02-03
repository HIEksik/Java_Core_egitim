package slaytSorular_DataCasting;

import java.util.Scanner;

public class C09_nestedifElse {
    public static void main(String[] args) {
        // Kullanicidan aldigi urun adedi ve  liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen ürün adedini giriniz :");
        int urunAdedi=scanner.nextInt();

        System.out.println("Lütfen liste fiyatını yazın :");
        double fiyat=scanner.nextDouble();


        System.out.println("Müşteri kartınız varmı  : E evet  .. H hayır " );
        char kart=scanner.next().toUpperCase().charAt(0);



        if (kart=='E' && urunAdedi>10){
            System.out.println("Aldığınız ürünler için %20 indirim "+(fiyat=(fiyat*20)/100)+" TL "+"yapılmıştır");
        } else if (kart=='E'&& urunAdedi<10) {
            System.out.println("Aldığınız ürünler için %15 indirim "+(fiyat=(fiyat*15)/100)+" TL "+"yapılmıştır");
        } else if (kart=='H' && urunAdedi>10) {
            System.out.println("Aldığınız ürünler için %15 indirim "+(fiyat=(fiyat*15)/100)+" TL "+"yapılmıştır");
        } else if (kart=='H'&& urunAdedi<10) {
            System.out.println("Aldığınız ürünler için %10 indirim "+(fiyat=(fiyat*10)/100)+" TL "+"yapılmıştır");
        }


    }
}
