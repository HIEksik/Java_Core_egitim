package day10_stringManipulations;

import java.util.Locale;

public class C01_stringManipulations {
    public static void main(String[] args) {

        String str="Java Candir";

        // str ı büyük yazdır
        System.out.println(str.toUpperCase());// JAVA CANDIR

        // str ı küçük yazdır
        System.out.println(str.toLowerCase());// java candir

        //String methodları kullanıldıgında orjinal metin değişmez
        System.out.println(str);// Java Candir

        // degişikliği kalıcı yapmak istersek atama yapmalıyız

        str=str.toUpperCase();

        System.out.println(str);// JAVA CANDIR

        // str ı küçük harfe çevirin
        // ancak büyük I harfi küçük harfe çevrildiginde ingilizce i olur

        System.out.println(str.toLowerCase());// java candir

        //eger metinde ingilizcede olmayan bir harf varsa I yı
        // Türkçe küçük ı ya çevirmek istersek
        // toLoverCase(Local...) Kullanılabilir
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candır
        // sadece ı harfinde olur bu metod sadece i yi türkçe ı yapar





    }
}
