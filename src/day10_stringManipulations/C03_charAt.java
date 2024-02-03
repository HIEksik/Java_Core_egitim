package day10_stringManipulations;

public class C03_charAt {
    public static void main(String[] args) {

        String str="Java Candir";

        // İlk harfi yazdırın
        System.out.println(str.charAt(0));// J
        System.out.println(str.charAt(7));// n  index sırasını yazdırır

        // son harfi yazdırın

        System.out.println(str.charAt(10)); // r

        // karakter sayısı ile index sayısı farklıdır burda karakter sayısı 11 index e göre 10 dur
        // karakter 1 den başlar index 0 dan başlar

        System.out.println(str.charAt(11-1));// r

        // uzunlugu bulmak için Length () kullanılır

        System.out.println(str.length()); // karakter sayısını verir // 11

        // son harfi bulmak için str.charAt(str.length()-1) kullanılır
        // kaç index varsa onun uzunluğunu verir

        System.out.println(str.charAt(str.length()-1)); // 10 r

        // eger bir kod yazarken verilen input taki değişimnleri algılasın ve yeni haline göre isteneni yapsın
        // istiyorsak dinamik kod yazmalıyız.
        // bunun için elle yazacagımız index degeri yerine metnin length ini kullanırız

        // sondan 3 üncü harfi yazdırın
        System.out.println(str.charAt(str.length()-3));// d

        // olmayan bir index kullanırsak ne olur

       //  System.out.println(str.charAt(20));// StringIndexOutOfBoundsException sınırların dışında

       // System.out.println(str.charAt(str.length()));// StringIndexOutOfBoundsException


    }
}
