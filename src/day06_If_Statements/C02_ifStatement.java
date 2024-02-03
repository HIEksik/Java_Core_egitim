package day06_If_Statements;

import java.util.Scanner;

public class C02_ifStatement {
    public static void main(String[] args) {

        //Kullanıcıdan 2 sayı alın
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen iki sayi giriniz");
        double sayi1=scanner.nextDouble();
        double sayi2=scanner.nextDouble();

        //ilk sayi 2.den büyükse "büyüksün sayı bir"

        boolean sonuc=sayi1>sayi2;

        if (sonuc){
           System.out.println("Büyüksün sayi bir");
       }

       // ikinci sayi sıfırdan büykse "Büyüksün sayi iki"

        sonuc=sayi2>0;
        if (sonuc){
            System.out.println("Büyüksün sayi iki");
        }

        // iki sayının toplamı 100 den büyükse "ikinizde büyüksünüz"

        sonuc=sayi1+sayi2>100;

        if (sonuc){
            System.out.println("İkinizde büyüksünüz");
        }


    }
}
