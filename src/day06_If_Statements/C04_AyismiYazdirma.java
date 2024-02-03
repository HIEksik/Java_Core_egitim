package day06_If_Statements;

import java.util.Scanner;

public class C04_AyismiYazdirma {
    public static void main(String[] args) {
        //Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir ay harfi girin : ");

        char chr = scanner.next().charAt(0);

        if (chr == 'o' || chr == 'O') {
            System.out.println("Ocak");
        }
        if (chr == 's' || chr == 'S') {
            System.out.println("Subat");
        }
        if (chr == 'm' || chr == 'M') {
            System.out.println("Mart veya Mayıs");
        }
        if (chr == 'n' || chr == 'N') {
            System.out.println("Nisan");
        }
        if (chr == 'h' || chr == 'H') {
            System.out.println("Haziran");
        }
        if (chr == 't' || chr == 'T') {
            System.out.println("Temmuz");
        }
        if (chr == 'a' || chr == 'A') {
            System.out.println("Agustos veya Aralık");
        }
        if (chr == 'e' || chr == 'E') {
            System.out.println("Eylul veya Ekim");
        }
        if (chr == 'k' || chr == 'K') {
            System.out.println("Kasım");
        }


    }
}
