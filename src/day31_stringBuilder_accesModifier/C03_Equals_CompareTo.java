package day31_stringBuilder_accesModifier;

public class C03_Equals_CompareTo {
    public static void main(String[] args) {

        /*
        String ile StringBuilderi == ile karşılaştırmamıza itiraz eder çalışmaz ,
        Equals ile karşılaştırmamıza itiraz Etmez fakat her zaman false verir.
        Sadece kendisi ile karşılaştırırsak true verir.

         */
        StringBuilder sb =new StringBuilder("Java");
        String str="Java";
        StringBuilder sb1=new StringBuilder(str);

        //System.out.println(sb==str);  Farklı data türündeki non-primitive ler == ile karşılaştırılamazlar çalışmaz

        System.out.println(sb==sb1);// false
        System.out.println(sb==sb);// true
        // ==  ile StringBuilderlerin karşılaştırılmasına itiraz etmez
        // kensisi ile karşılaştırılması hariç sonuç hep false döner

        System.out.println(sb.equals(str));// false
        System.out.println(sb.equals(sb1));// false
        System.out.println(sb.equals(sb));// true
        // equals methodu da aynı şekilde String veya Stringbuilder lar ile
        // karşılaştırılmasına itiraz etmez ama
        // kensisi ile karşılaştırılması hariç sonuç hep false döner

        // StringBuilder ların aynı metne sahip olup olmadığını öğrenmek için
        // compareTo kullanılır

        StringBuilder sb2=new StringBuilder("Hava");
        StringBuilder sb3=new StringBuilder("Tava");
        StringBuilder sb4=new StringBuilder("Jale");
        StringBuilder sb5=new StringBuilder("Jandarma");

        // Compareto ile karşılaştırılan StringBuilderlar metin olarak ayonı ise sorunuç 0 olur.
        // aynı degilse aski tablosunda harf harf karşılaştırır ve
        // harfin önceligine göre kaç fark varsa - yada + olarak yazar

        System.out.println(sb.compareTo(sb1));// Java=>Java  0
        System.out.println(sb.compareTo(sb2));// Java=>Hava  2
        System.out.println(sb.compareTo(sb3));// Java=>Tava  -10
        System.out.println(sb.compareTo(sb4));// Java=>Tava  10
        System.out.println(sb.compareTo(sb5));// Java=>Tava  8

    }
}
