package day10_stringManipulations;

public class C04_subsitring {
    public static void main(String[] args) {

        String str="Java Candir";

        // hangi indexi yazarsak o index ten iti baren yazdırır substring()
        // Strinde iki farklı yöntemle substring elde ede biliriz

        // 1 -  tek  parametre yazarsak

        // yazdıracagımız metini  hangi indexten seçersek  o indexten itibaren yazdıra biliriz

        System.out.println(str.substring(3));// a Candir
        System.out.println(str.substring(0));// Java Candir
        System.out.println(str.substring(9));// ir

        // son 3 karakteri yazdırın

        System.out.println(str.substring(8));// dir

        // Dinamik olması için length i kullanak yazmamız lazım

        System.out.println(str.substring(str.length()-3));// dir //  uzasada kısaldada dinamik olarak son 3 harfi verdi

     // uzunlugun üzrinde bir sayı girilirse hata verir
      //  System.out.println(str.substring(20)); // StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length()));// hiçlik döndürüyor boş bir satır // charAt() te hata vermişti

      //  System.out.println(str.substring(str.length()+1)); // StringIndexOutOfBoundsException // hata verir


        // 2 YÖNTEM
        // 2 parametreli substring()
        // 2 parametre yazarsak ilk parametre ye eşit olan index ten başlar
        // ikinci parametreye eşit olan indexe kadar yazdırır
        // ( ilk index dahil ikinci index dahil degil )


        // "Java Candir";

        System.out.println(str.substring(1, 6)); // ava C ( ilk index dahil 2. index değil )
        System.out.println(str.substring(0,7));// Java Ca
        System.out.println(str.substring(1, 2));// a

        // 7.index deki  elemanı yazdırın
        System.out.println(str.charAt(7));// n

        System.out.println(str.substring(7, 8)); // n

        // charAt(). olunca noktadan sonra hiç bir method kullanılmıyor..sadece yazdırabilir.

      //   str.substring(7,8). String oldugu için method kullanabiliriz..eşitmi, boşlukmu

        System.out.println(str.substring(2, 2));// hiçlik yazar ( 2 den başlar 2 yi geri bırakır )


       // System.out.println(str.substring(6, 4));// StringIndexOutOfBoundsException
        // hata verir uzunlugu geçtigi için

        // ilk 7 karakteri yazdırın

        System.out.println(str.substring(0,7));// Java Ca


    }
}
