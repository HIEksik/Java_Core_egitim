package day06_If_Statements;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        /*
        Bagımsızz if cümleleri kodun geri kalanı ile ilgilenmez sadece if parantezindeki
        boolean şarta odaklanır.
        Bolean şart true ise if body si çalışır
        bolean şart false ise if body si çalışmaz

        Birden fazla bagımsız if cümlesi kullanıldığında girilen degere baglı olarak tüm if body leri
        devreye girebilecegi gibi hiç bir if body si devreye girmeyebilir

          */



        // kullanıcıdan iki deger alın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki tam sayi gitiniz : ");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // 1. sayi 2. sayıdan büyükse Aferin yazdırın
        if (sayi1 > sayi2) {

            System.out.println("Aferin");
        }
        // 1. sayı çift ise çift sayiları severim
        if (sayi1 % 2 == 0) {
            System.out.println("Çift sayilari severim");
        }
        // 2. sayı 50den büyükse büyük sayılarla işim olmaz yazdırın
        if (sayi2 > 50) {
            System.out.println("Büyük sayilarla işim olmaz");
        }
        // toplamları 100 den küçükse ufak sayılarla işim olmaz yazdırın
        if (sayi1 + sayi2 < 100) {
            System.out.println("Küçük ufak sayılarla işim olmaz");
        }


    }
}
