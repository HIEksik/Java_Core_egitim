package day15_methodOolusturma;

import java.util.Scanner;

public class C02_AsalsayiMethodu {
    public static void main(String[] args) {
        //Kullanicidan main method icinde pozitif bir tamsayi alin.
        // Girilen sayinin asal sayi olup olmadigini kontrol edip,
        // sonuc olarak “asal sayi” veya “asal sayi degil”
        //yazdıran bir method olusturun.

// Çözüm herşeyi bu requaymints a göre yapacagız yani istenen bilgiye göre

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        asalSayiMi(sayi);


    }


    public static void asalSayiMi( int sayi ) {
        // sonuc olarak “asal sayi” veya “asal sayi degil”

        int flag=20;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                flag++;
                break;
            }
        }

        if (flag==20){
            System.out.println("Verilen sayi asal");
        }else {
            System.out.println("Verilen sayi asal degil");
        }

    }


}

