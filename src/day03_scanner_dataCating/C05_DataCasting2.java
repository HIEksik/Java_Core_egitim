package day03_scanner_dataCating;

public class C05_DataCasting2 {
    public static void main(String[] args) {

        // küçük data türündeki değerin büyük data türündeki variabnle.'a atamak isterseniz
        // java bunu otomatik olarak yapar // Auto Widening denir.


        byte a = 15;

        short b = a;

        int c = b;

        long d = c;

        double e = d;

        // Eger buyuk data türündeki dehgeri küçük data türündeki variable'a atamak istersek
        // java bunu otomatik olarak yapmaz. Sorumluluğu almamızı ister
        // Byuk data türündeki degerin önüne parantez içinde cevirmek istediğimiz küçük data turunu yazarız.
        // Explicit narrowing - zorlayarak daraltma denir.
        // bu işlemde data kaybı ve bata başkalaşımı olur.


        double f =34.5;

        int g =(int) f;

        short h =(short) g;

        byte k =(byte) h;


    }
}
