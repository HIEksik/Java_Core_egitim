package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C07_Scanner_slayt {
    public static void main(String[] args) {
        //Kullanicidan bir double,birde int sayi alip bunlarin toplamini ve carpimini yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir Tam sayi giriniz : ");

        int tamSayi=scanner.nextInt();

        System.out.println("Bir Ondalikli sayi giriniz : ");

        double ondalikli=scanner.nextDouble();
        System.out.println("Girilen sayilarin toplami : "+(tamSayi+ondalikli));
        System.out.println("Gieilen sayiların Çarpımı : "+(tamSayi*ondalikli));

    }
}
