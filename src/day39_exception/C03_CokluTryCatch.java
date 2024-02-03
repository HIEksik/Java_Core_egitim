package day39_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_CokluTryCatch {
    public static void main(String[] args) {

        // Kullanicidan 2 tam sayi isteyin
        // birinci sayiyi ikinci sayiya bölüp sonucun tam sayı kısmını yazdırın


        /*
        Birden fazla risk varsa çözüm olarak
        1- Risk ler ayrı ayrı TryCatch içine alınabilir
        2- İç içe try catch kullanılabilir
        3- tek Try birden fazla catch blogu olabilir

         */

        Scanner scanner=new Scanner(System.in);


        int sayi1=0;
        int sayi2=1;
        try {
            System.out.println("Lütfen bölünecek tam sayiyi girin");
            sayi1=scanner.nextInt();

            System.out.println("Lütfen bölecek tam sayiyi girin");
            sayi2=scanner.nextInt();

            System.out.println("ilk sayi/ikinci sayi ="+sayi1/sayi2);

        } catch (InputMismatchException e) {

            System.out.println("Tam sayi giriniz");
        } catch (ArithmeticException e) {

            System.out.println("Bölecek sayi 0 olamaz");
        }catch (Exception e) { // Ön göremedigimiz başka bir Exception olursa bu çalışsın

            System.out.println("Girilen degerler uygun degildir");
        }





    }
}
