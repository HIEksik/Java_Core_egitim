package day10_stringManipulations;

public class C02_equals {
    public static void main(String[] args) {

        String str1="Ahmet";
        String str2="AHMET";
        String str3="ahmet";
        String str4="ahMeT";
        String str5="Ahmet";
        String str6=new String("Ahmet");
        String str7="Ah";
        String str8="met";
        String str9=str7 + str8;//Ahmet

        // 1 - String Case sensitive dir ( küçük büyük harfe duyarlıdır )
        // str1, str2, str3, str4 ün degerleri bir birinden farklıdır
        // str1, str5, str6 ve str9 un degerleri ise aynıdır


        // String de karşılaştırma için == kullanırsanız
        // metni aynı olan Stringlerde bile False dönebilir
        // == hem metin degerine hemde referansa baktıgı için metni aynı olan farklı strinler için farklı sonuçlar verebilir

        System.out.println(str1 == str5);// Ahmet==Ahmet true
        System.out.println(str1 == str6);// Ahmet==Ahmet false
        System.out.println(str1=="Ahmet");// Ahmet==Ahmet true
        System.out.println(str1==str9);// Ahmet==Ahmet false

        // iki String i metin olarak aynı olup olmadığını kontrol etmek için Şimdilik == tir kullanmayacağız
        // Strinlerde metin olarak aynı olmayı kontrol için equals() kullanılır.

        // equals metodu aynı metinler için true döner
        System.out.println(str1.equals(str5));// Ahmet==Ahmet true
        System.out.println(str1.equals(str6));// Ahmet==Ahmet true
        System.out.println(str1.equals("Ahmet"));// Ahmet==Ahmet true
        System.out.println(str1.equals(str9));// Ahmet==Ahmet true

        // equals () aynı metnin farklı yazımı için ne döndürür
        System.out.println(str1.equals(str2));// Ahmet==AHMET false
        System.out.println(str1.equals(str3));// Ahmet==ahmet false
        System.out.println(str1.equals(str4));// Ahmet==AhMet false

        // Eger büyük büçük harf farklı yazımları de eşit kabul edelim derseniz
        System.out.println(str1.equalsIgnoreCase(str2));// Ahmet==AHMET true
        System.out.println(str1.equalsIgnoreCase(str3));// Ahmet==ahmet true
        System.out.println(str1.equalsIgnoreCase(str4));// Ahmet==AhMet true






    }
}
