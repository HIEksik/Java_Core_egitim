package day12_stringManipulation;

import java.awt.*;
import java.util.Scanner;

public class C09_stringManipulations {
    public static void main(String[] args) {
        // Kullanicidan isim , soyisim ve kredi kartı numarasını alın
        // görünürIsim olarak A**** N**** şeklinde
        // sadece ilk harfler büyük harf olarak görünsün diger harflar * olsun
        // görünür kart no : **** **** **** 1234 olsun


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim=scanner.nextLine();
        System.out.println("Lütfen soy isminizi giriniz");
        String soyIsim=scanner.nextLine();
        System.out.println("Lütfen kredi kartı numaranızı giriniz");
        String kkNo=scanner.nextLine();

        // kkno matemetiksel işlemde kullanılmayacağı için ve int sığmayacağı için string olarak kullandık

        String gorunurIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*")+
                " "+soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\S","*");

        String gorunurKartno="**** **** **** "+kkNo.substring(kkNo.length()-4);

        System.out.println(gorunurIsim);
        System.out.println(gorunurKartno);
    }
}
