package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C01_Scanner_slayt {
    public static void main(String[] args) {

        //Kullanıcıdan uc farklı data türünde değer alıp,Girilen degerleri acıklamalarıyla yazdırın

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz :");

        int tamSayi=scanner.nextInt();

        System.out.println("Lutfen bir virgullu sayı giriniz");

        double ondalik=scanner.nextDouble();


        scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");

        String metin=scanner.nextLine();

        System.out.println("Girilen sayi tam sayidir.Variable olarak İnteger'dır : "+tamSayi);
        System.out.println("Girilen sayi ondalıklıdır,Varible degeri double'dir : "+ondalik);
        System.out.println("Metin girdiniz,Variable degeri Stringtir : "+metin);

    }
}
