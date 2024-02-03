package day02_dataTurleri_Scanner;

public class C01_DataTurleri {
    public static void main(String[] args) {

        int sayi1 = 23;// hafızada 32 bit kaplar
        byte sayi2 = 23;// hafızada 8 bit kaplar
        short sayi3 = 23;// hafızada 16 bit kaplar
        long sayi4 = 23;//hafızada 64 bit kaplar

        char ch1 = '4';
        char ch2 = ' ';// space de #,%,& gibi bir karakterdir

        // char ch3='4 '; char data türü sadece 1 karakter kabul eder bırakılan boşluk ta bir karakter olarak sayılır

        String str1 = "Java Candir";
        String TelofonNo = "5555555";
        //int tel=555555555555;Telefon numarası matematiksel işlemlerde kullanılmadığından
        //                     ve int degerinden büyük olduğundan String olarak tutulabilir

        System.out.println("str1");//str1
        System.out.println(str1);// Java Candir

        int x = 23;

        int y = 13;

        // İki sayının toplamını yazdırın

        System.out.println("Sayıların Toplamı : " + (x + y));//36
        //Sayıların Toplamı : 36

        x = 15;

        System.out.println("x : " + x);// x : 15

        x = 3 * x + 1;

        System.out.println("x ' in yeni degeri : " + x); // x ' in yeni degeri : 46

        float fl1 = 20f;
        float fl2 = 6f;
        System.out.println(fl1 / fl2);//3.3333333

        double dbl1 = 20;
        double dbl2 = 6;

        System.out.println(dbl1 / dbl2);//3.3333333333333335


    }
}
