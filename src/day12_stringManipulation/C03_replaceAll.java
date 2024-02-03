package day12_stringManipulation;

import java.util.Scanner;

public class C03_replaceAll {
    public static void main(String[] args) {
        // Kullanıcıdan bir metin isteyin kullanıcının girdigi metinden
        // Space dışındaki tüm karakterleri ve sayıları silip metni yeni hali ile yazdırın
        // input : "J1a34va_12 C87an9+0d.6*54ir," output : java candir


       /*
        Regex (Regular Expressions)
        \\s : space
        \\S : space olmayan hersey
       \\s+ : yanyana birden fazla space
        \\d : digits
        \\D : digit olmayan hersey
        \\w : harf, rakam veya _
        \\W : harf, rakam veya _ olmayan hersey

       */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz");
        String metin=scanner.nextLine();

        // once sayilardan kurtulalim
        metin=metin.replaceAll("\\d","");

        // Space lere rakam atayalım yeri bilinsin
        metin=metin.replaceAll("\\s","5");

        // özel karakterlerden kurtulalım _ dışındaki herşey
        metin=metin.replaceAll("\\W","");

        // _'yi yok edelim "" ile , 5 yaptığımız space in yerine " " space bırakalım
        metin=metin.replaceAll("_","").replaceAll("5"," ");

        // yazdiralim
        System.out.println(metin);

    }
}
