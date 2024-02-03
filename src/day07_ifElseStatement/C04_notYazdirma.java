package day07_ifElseStatement;

import java.util.Scanner;

public class C04_notYazdirma {
    public static void main(String[] args) {

        // kullanıcıdan 100 üzerinden notunu alın
        // negatif veya 100 den büyük deger girerse geçersiz not ,
        // 85 ile yüz arasında ise sınırlar dahil AA
        // 65 dahil büyük ve 85 den küçükse  BB
        // 50 dahil büyük ve 65 ten küçükse CC
        // 50 den küçükse DD Kaldin yazdirin
        /*
        if
        else if
        else if
        else
        şiklinde yazılan bir kod için sonu else ile bittiginden bir sonuç yazdırmama ihtimali yoktur
        else if ... ile bütün if ler bir birine bağlandığından aynı anda iki if body sinin devreye girme ihtimali de yoktur

         */
        Scanner scanner=new Scanner(System.in);

        System.out.println("Notunuzu giriniz : ");
        double not=scanner.nextDouble();

        if (not<0 || not>100){
            System.out.println("Geçersiz not girdiniz ");
        } else if (not>=85) {
            System.out.println("Notunuz AA : ");

        } else if (not>=65) {
            System.out.println("Notunuz BB");
        } else if (not>=50) {
            System.out.println("Notunuz CC");
        }else {
            System.out.println("Kaldınız");
        }


    }
}
