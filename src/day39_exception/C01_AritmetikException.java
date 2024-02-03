package day39_exception;

import java.util.Scanner;

public class C01_AritmetikException {
    public static void main(String[] args) {
        // Kullanicidan 2 tam sayi isteyin
        // birinci sayiyi ikinci sayiya bölüp sonucun tam sayı kısmını yazdırın

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bölünecek tam sayiyi girin");
        int sayi1=scanner.nextInt();

        System.out.println("Lütfen bölecek tam sayiyi girin");
        int sayi2=scanner.nextInt();

        if (sayi2==0){
            System.out.println("bolecek sayi 0 lamaz");
        }else {

            System.out.println("ilk sayi/ikinci sayi ="+sayi1/sayi2);

        }





    }

}
