package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C09_Scanner_Slayt {
    public static void main(String[] args) {

        /*
        Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.
         */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Isminizi Giriniz : ");

        String isim=scanner.nextLine();

        System.out.println("Soyisminizi Giriniz : ");

        String soyIsim=scanner.nextLine();

        System.out.println("Yasinizi Giriniz : ");

        int yas=scanner.nextInt();

        System.out.println("Isminiz : "+isim);
        System.out.println("Soyisminiz : "+soyIsim);
        System.out.println("Yasiniz : "+yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
    }
}
