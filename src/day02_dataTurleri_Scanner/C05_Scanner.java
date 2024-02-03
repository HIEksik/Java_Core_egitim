package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // Kullanicidan bir double, birde int sayi alip bunların toplamını ve çarpımını yazdırın

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz :");

        int tamSayi=scanner.nextInt();

        System.out.println("lütfen bir ondalıklı sayı giriniz : ");

        double ondallikSayi=scanner.nextDouble();

        System.out.println("Girilen sayiların toplamı: "+(tamSayi+ondallikSayi));
        System.out.println("Girilen sayilarin çarpımı: "+ (tamSayi*ondallikSayi));



    }
}
