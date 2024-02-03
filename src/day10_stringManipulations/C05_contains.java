package day10_stringManipulations;

public class C05_contains {
    public static void main(String[] args) {

        // içerip içermediğine bakar
        // adet gözetmeksizin Stringe aranan metnin var olup olmadığına bakar metin varsa true yoksa false döndürür adet yazmaz

        String str="Java Candir";
        System.out.println(str.contains("a"));// true
        System.out.println(str.contains("b"));// false
        System.out.println(str.contains("java"));// false Büyük küçük harf duyarlı
        System.out.println(str.contains("Java"));// true
        System.out.println(str.contains("a C"));// true
        System.out.println(str.contains(" "));// true
        System.out.println(str.contains(""));// true hiçlik heryerde vardır


    }
}
