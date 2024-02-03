package day03_scanner_dataCating;

import java.util.Scanner;

public class C07_CharDataturu {
    public static void main(String[] args) {

        // Char özel bir daha türüdür.
        // '4' sadece tek karakter alır.
        // Char data türündeki variable'lar ve degerler
        // matematiksel işlemlere kullanılırsa
        // ASCII table'daki decimal karşılıkları ile işleme girerler

        System.out.println('a'+'b');// 97 + 98 = 195 Ascıı tablodaki değerleri yazar

        System.out.println('0'+'1');//48 + 49 = 97

        int sayi= 'c';
        System.out.println(sayi);//99

        char chr = 101 ;

        System.out.println(chr); // e

        // Kullanıcıdan bir karakter isteyin, kullanıcının girdigi karakterden sonraki 3 karakteri yazdırın .

        Scanner scanner=new Scanner(System.in);

        System.out.println("Bir karakter giriniz : ");

        char chr1=scanner.next().charAt(0);

        System.out.println("Girilen karakter : " + chr1);
        System.out.println("Girilen karatlerden 1 sonraki karakter : "+(char)(chr1+1));
        System.out.println("Girilen karatlerden 2 sonraki karakter : "+(char)(chr1+2));
        System.out.println("Girilen karatlerden 3 sonraki karakter : "+(char)(chr1+3));





    }
}
