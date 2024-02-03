package day08_nestedIfElseStatement;

import java.util.Scanner;

public class C03_nestedIfelseStatementindirimliurun {
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


        if (urunAdedi>10){
           // Ürün adedi 10 dan fazla olanlar

            if (kartVarmi=='E'){
                indirimOrani=20;

            } else if (kartVarmi=='H') {
                indirimOrani=15;
            }else {
                System.out.println("Kart bilgisi hatalı...");
            }

        } else if (urunAdedi>0) {
           // Ürün adedi 10 dan az alanlar

            if (kartVarmi=='E'){
                indirimOrani=15;

            } else if (kartVarmi=='H') {
                indirimOrani=10;

            }else {
                System.out.println("Kart bilgisi hatalı...");
            }


        }else {
            System.out.println("Ürün adedi hatalı...");

        }if (indirimOrani>0){
            System.out.println("%"+indirimOrani+" İndirim yapılmıştır  : "+indirimsizFiyat*urunAdedi*(100-indirimOrani)/100);
        }


    }
}
