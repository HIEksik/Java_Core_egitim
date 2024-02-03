package day03_scanner_dataCating;

import java.util.Scanner;

public class C08_DataCasting {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 3;

        System.out.println(sayi1/sayi2);// 6.66666... ama java bunu 6 olarak yazar

        // integer iki sayı bir birine bölünürse sonuç integer yapar.


        double sayi3= 3;

        System.out.println(sayi1/sayi3);//6.666666666666667

        // Kullanıcıdan iki tam sayı alıp 1. sayısı 2. sayıya bölün
        // sonucu ondalıklı olarak yazdırın

        Scanner scanner=new Scanner(System.in);

        System.out.println("lütfen 1. tam sayı giriniz :");

        int sayi4=scanner.nextInt();

        System.out.println("lütfen 2. tam sayıyı girin : ");

        double sayi5=scanner.nextInt();

        System.out.println("Sonuç ondalıklı olarak yazıldı : "+sayi4/sayi5);





    }
}
