package day13_forLoop;

import java.util.Scanner;

public class C08_for_faktoryel {
    public static void main(String[] args) {
        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20 den küçük bir sayı giriniz ");

        int sayi = scanner.nextInt();

        long faktoryel = 1;

        // öncelikle "6! = " burayı alacağız
        //sonra "6 * 5 * 4 * 3 * 2 * " alacağız
        // sonra "1 = 720" özel durumu yanına * işareti gelmeyecek

        System.out.print(sayi + "! = ");       // 6! =    Kullanıcının girdigi sayı

        for (int i = sayi; i >= 1; i--) {    // 6 5 4 3 2 1 getirecek

            faktoryel *= i;

            if (i != 1) {
                System.out.print(i + " * "); // 6 * 5 * 4 * 3 * 2 * ( 1 için else kullanacağız )
            } else {
                System.out.print(i + " = "); //  1 = yazdırdık
            }
        }

        System.out.print(faktoryel); // 720 yi yazdırdık
    }
}
