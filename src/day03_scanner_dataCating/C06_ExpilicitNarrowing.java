package day03_scanner_dataCating;

public class C06_ExpilicitNarrowing {
    public static void main(String[] args) {


        // Explicit Narrowing yaptığımızda
        // data değişebilir / data kayıpları olabilir.
        // hatta bazen data başka bir sayıya dönüşe bilir.


        double dbl = 34.99;

        int sayi = (int) dbl;

        System.out.println(sayi); // 34 (ondalıklı kısmı siler)

        int sayi1 = 23;

        byte byt = (byte) sayi1;

        System.out.println("23 ün byte olarak değeri : " + byt); // 23 zaten bayte sığıyor

        int sayi2 = 130;

        byt = (byte) sayi2;

        System.out.println("130 un byte olarak değeri : " + byt); // -126 artı değerinde 127 ye kadar olduğu için
        // - eksik değerin başına gitti ve oradan düşüm yaparak sayıya ulaştı


        int sayi3 = 260;

        byte byt1 = (byte) sayi3;

        System.out.println("260 ün byte olarak değeri : " + byt1);//4


        int sayi4 = 2600;

        byte byt2 = (byte) sayi4;

        System.out.println("2600 ün byte olarak değeri : " + byt2);// 40


        int sayi5 = 2100000000;
        sayi5 = sayi5 + 500000000;// casting yok ( sınırlar aşıldığı için sonuç başa döndü eksik olarak verildi sonuç )

        System.out.println(sayi5);//-1694967296


    }
}
