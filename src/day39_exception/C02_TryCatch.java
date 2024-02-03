package day39_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {

        // Kullanicidan 2 tam sayi isteyin
        // birinci sayiyi ikinci sayiya bölüp sonucun tam sayı kısmını yazdırın

        Scanner scanner=new Scanner(System.in);

        /*
         Yazılan kodun neresinde sorunlar oluşabilecegini ön görüp sorun oluşa bilecek
         durumlar için  Java ya yapması gerekenleri Tembihlemeliyiz

         Eger ön görülen risk birden fazla ise bu riski taşıyan kodlar ayrı ayrı try catch blokları ile
         handle (kontrol ) altına alınabilir

         Ama bu durumda ikisi ayrı ayrı olduğundan senkronize çalışmaya bilir


          */


        int sayi1=0;
        int sayi2=1;
        try {  // yapmayı dene / herşey yolunda ise bu blok çalışır // catch bloguna ihtiyaç kalmaz
            System.out.println("Lütfen bölünecek tam sayiyi girin");
            sayi1=scanner.nextInt();

            System.out.println("Lütfen bölecek tam sayiyi girin");
             sayi2=scanner.nextInt();

        } catch (InputMismatchException e)  // eger try blogu çalışırken Inputmistake excaption oluşursa
                                            // e objesine akaydet catch { } blogu içerisinde sana söyleneni yap

        {

            System.out.println("Tam sayi giriniz"); // burada söyleneni yap
        }

        try {
            System.out.println("ilk sayi/ikinci sayi ="+sayi1/sayi2);
        } catch (ArithmeticException e) {
            System.out.println("Bolecek sayi 0 olamaz ");
        }


    }
}
