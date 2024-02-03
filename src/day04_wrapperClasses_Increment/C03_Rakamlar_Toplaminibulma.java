package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C03_Rakamlar_Toplaminibulma {
    public static void main(String[] args) {
        // kullanıcıdan 3 basamaklı bir tam sayı alıp
        // sayının rakamlar toplamını yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir sayı giriniz");
        int girilenSayi = scanner.nextInt();

        // diyelimki kullanıcı 375 sayısını girdi

        // bize birler basamağını ve rakamlar toplamını kaydedecigimiz iki variable lazım

        int birlerbasamagi=0;
        int rakamlarToplami=0;

        birlerbasamagi=girilenSayi%10;

        rakamlarToplami=rakamlarToplami+birlerbasamagi;

        // 5 i rakamlar toplamına ekledik
        // 5 ten kurtulalım

        girilenSayi=girilenSayi/10;

        birlerbasamagi=girilenSayi%10;

        rakamlarToplami=rakamlarToplami+birlerbasamagi;

        girilenSayi=girilenSayi/10;

        rakamlarToplami=rakamlarToplami+girilenSayi;

        System.out.println("Girilen sayinin rakamlar topğlami :"+rakamlarToplami);



    }
}
