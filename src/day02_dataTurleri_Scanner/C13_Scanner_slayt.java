package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C13_Scanner_slayt {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap).


        Scanner scanner=new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz :");

        int sayi1=scanner.nextInt();

        System.out.println("ikinci sayıyı giriniz :");

        int sayi2=scanner.nextInt();


        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        System.out.println("girilen birinci sayi :"+sayi1);

        System.out.println("Girilen ikinci sayi : "+sayi2);
    }
}
