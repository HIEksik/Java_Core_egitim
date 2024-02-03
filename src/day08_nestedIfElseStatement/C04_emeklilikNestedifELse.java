package day08_nestedIfElseStatement;

import java.util.Scanner;

public class C04_emeklilikNestedifELse {
    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner=new Scanner(System.in);


        System.out.println("Lütfen cinsiyetinizi giriniz :");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz :");
        int yas=scanner.nextInt();

        // ANA DEGİŞKEN CİNSİYET


        if (cinsiyet=='K'){

       if (yas>=60){
           System.out.println("Emekli olabilirsin");
       } else if (yas>0) {
           System.out.println("Emeklilik yaşına " + (60-yas)+" Yıl kaldı");

       }else {
           System.out.println("Yaşı hatalı girdiniz ");
       }


        } else if (cinsiyet=='E') {

            if (yas>=65){
                System.out.println("Emekli olabilirsiniz");
            } else if (yas>0) {
                System.out.println("Emeklilik yaşına " + (65-yas)+" Yıl kaldı");

            }else {
                System.out.println("Yaşı hatalı girdiniz ");
            }

        }else {
            System.out.println("Cinsiyet yanlış girişdi");
        }


    }
}
