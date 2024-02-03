package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Adınızı giriniz :");

        String isim=scanner.nextLine();

        System.out.println("Soyadınızı giriniz :");

        String soyIsim=scanner.nextLine();

        System.out.println("Yasinizi giriniz :");

        int yas=scanner.nextInt();

        System.out.println("İsminiz : "+isim);
        System.out.println("Soyisminiz : "+soyIsim);
        System.out.println("Yasiniz : "+yas);
        System.out.println("Kaydınız basariyla tamamlanmistir");
    }
}
