package day04_wrapperClasses_Increment;

public class C01_WrapperClasses {
    public static void main(String[] args) {


        int sayi = 10;

        String str = "JAva Candir";

        // Java primitive data türleri için de
        // istedigimizde method kullanabilmemize imkan vermek amacıyla
        // Wrapper Class ları oluşturmuştur
        // Boolean , Character, Byte , Short , Integer, Long , Float ve Double

        System.out.println(Integer.MAX_VALUE);// 2147483647
        System.out.println(Double.MAX_VALUE);// 1.7976931348623157E308

        String sayi1 = "103";
        String sayi2 = "204";

        // sayi1 ile sayi2 yi toplayın

        System.out.println(sayi1 + sayi2);// 103204 String metin olduğu için yan yana getirdi

        int sayi1indegeri = Integer.parseInt(sayi1);// birinci method Stringi int a çevirdi.
        int sayi2nindegeri = Integer.valueOf(sayi2);// Stringi sayıya çevirdi.

        System.out.println("String olarak verilen iki sayinin toplamı : " + (sayi1indegeri + sayi2nindegeri));// 307

        // Wrapper Class lar bize methodlar sunuyorlar.

        System.out.println(Integer.max(34, 45));// degeri büyük olan sayı hangisi onu verir 45

        char chr1='7';
        char chr2='r';
        char chr3='#';

        System.out.println(Character.isLetter(chr1));// false

        System.out.println(Character.isLetter(chr2));// true

        System.out.println(Character.isAlphabetic(chr3));// false

        // chr2 nin degeri olan r yi büyük harf yapın

        System.out.println(Character.toUpperCase(chr2));// R hazır methodlarla büyük harfe çevire biliriz




    }
}
