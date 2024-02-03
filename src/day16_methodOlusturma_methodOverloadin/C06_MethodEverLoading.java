package day16_methodOlusturma_methodOverloadin;

public class C06_MethodEverLoading {
    public static void main(String[] args) {
        /*
        Java bir clasa ta aynı isimden birden fazla method olmasına izin veriri
        Ancak Signatureleri () farklı olmak zorundadır.

        Signature = > method ismi + paramametre data türleri demektir.

        Eger aynı isimde bir den fazla method varsa
        1- java öncelikle 100/100 uyumlu olan argument ve marametreler arasında uyum olan varmı buna bakar diye kontrol eder


         */

        topla(6);// 1
        topla(3,5); // 2
        // önce sinature ına bakar ve int int oldugunu görür ve çalıştırır
        toplam(6.5,8); // 4

        // 2- Eger 100% uyum yoksa casting ile kullanılabilecek var mı diye tümünü kontrol eder

        topla('a',5);// topla char int
        // hepsini kontrol eder casting ile hangisi uygunsa onu yazdırır ama en uygun olanı yazdırır
        // int int olarak yazdırır

        toplam(2.5f,5.5f);// 3 topla double double kabul eder
        // casting ile kabul edecegi methodu kontrol eder hepsine bakar en uygun olanı seçip yazar
    }
    // Overloading olması için method sisminin aynı olması lazım
    public  static void topla(int sayi){ // topla int
        System.out.println("Tek int : "+(sayi+sayi));
    } // 1
    public static void topla(int a,int b){// topla int int
        System.out.println("int int : "+ (a+b));
    } // 2

    public static void toplam(double c,double d){// topla double, int
        System.out.println("double , int : "+(c+d));
    } // 3
    public static void toplam(double c,int d){// topla double,int
        System.out.println("double , int : "+(c+d));
    } // 4

    public static void toplam(float c,double d){// topla float, double
        System.out.println("double , int : "+(c+d));
    } // 5
}
