package day31_stringBuilder_accesModifier;

public class C02_StringBuilderIleStringMethodKullanma {
    public static void main(String[] args) {

        /*
        Methodlarda StringBuilder döndürüyorsa degişim kalıcı olur ama String veya diger data türlerini döndürüyorsa kalıcı olması için
       atama kullanarak  New String builderi ile parantezin içine yazmamız lazım.



         */
        StringBuilder sb=new StringBuilder("Java Candir");

        // sb yi büyük hafle yazdırın

        System.out.println(sb.toString().toUpperCase()); // JAVA CANDIR

        // String builderde olmayan String özelliklerini kullanmak istersek
        // önce ToString() ile stringe çevirip sonra istedigimiz String methodu kullanırız

        // bu degişiklik kalıcı oldumu

        System.out.println(sb);// Java Candir

        // Peki atama yaparsak kalıcı olur mu ?

        // sb=sb.toString().toUpperCase();
      ////// Farklı data türündeki non primitive variableler bir birine atanamaz veya bir biri ile karşılaştırılamazlar

        StringBuilder sb1=new StringBuilder("Java");

        // Eger Sb nin degerini Büyük harf yapıp kalıcı,
        // olarak degiştirmek istiyorsak

        // String Builder i String method kullanarak kalıcı işlem yapmak istiyorsak .. Degiştirecegimiz Sb variablesini
        // önce new key wrod ile yeni bir Strinbuilder yapıp parantez içine sb variablesi .toString() ile String methodlarını kullanırız
        sb=new StringBuilder(sb.toString().toUpperCase());

        System.out.println(sb);//  JAVA CANDIR

        System.out.println(sb.substring(5)); // CANDIR kalıcı degil Return typ String

        System.out.println(sb);// JAVA CANDIR





    }
}
