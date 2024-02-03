package day10_stringManipulations;

public class C06_startsWith_ennsWith {
    public static void main(String[] args) {


        String str = " Java Candir";

        // Stringin hangi ifade ve ya kelime ile başladığını söyler true veya false döndürür

        System.out.println(str.startsWith("J"));// true
        System.out.println(str.startsWith("Ja"));// true
        System.out.println(str.startsWith("Jav"));// true
        System.out.println(str.startsWith("Java Candir"));// true
        System.out.println(str.startsWith(""));// true

        // Aynısı endSwith içinde geçerli

        System.out.println(str.endsWith("r"));//true
        System.out.println(str.endsWith("dir"));// true
        System.out.println(str.endsWith("Java Candir"));// true
        System.out.println(str.endsWith(""));// true


    }
}
