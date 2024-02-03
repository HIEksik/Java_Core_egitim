package day06_If_Statements;

import java.util.Scanner;

public class C05_Ayismiyazdirma2 {

    public static void main(String[] args) {
        //Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        // Eger girilen harf ile ilgili ay yoksa "giirdiginiz harf ile baslayan ay yok " yazdırın
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir ay harfi girin : ");

        char chr = scanner.next().charAt(0);

        int flag=44;

        if (chr == 'o' || chr == 'O') {
            System.out.println("Ocak");
            flag++;
        }
        if (chr == 's' || chr == 'S') {
            System.out.println("Subat");
            flag++;
        }
        if (chr == 'm' || chr == 'M') {
            System.out.println("Mart veya Mayıs");
            flag++;
        }
        if (chr == 'n' || chr == 'N') {
            System.out.println("Nisan");
            flag++;
        }
        if (chr == 'h' || chr == 'H') {
            System.out.println("Haziran");
            flag++;
        }
        if (chr == 't' || chr == 'T') {
            System.out.println("Temmuz");
            flag++;
        }
        if (chr == 'a' || chr == 'A') {
            System.out.println("Agustos veya Aralık");
            flag++;
        }
        if (chr == 'e' || chr == 'E') {
            System.out.println("Eylul veya Ekim");
            flag++;
        }
        if (chr == 'k' || chr == 'K') {
            System.out.println("Kasım");
            flag++;
        }
        if (flag==44){
            System.out.println("Girdiginiz harf ile baslayan ay yok ");
        }
    }
}
