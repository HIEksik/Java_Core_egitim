package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C10_Scanner_Slayt {
    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve yasını alip assagıdaki formatta yazdırın.
        //   girilen bilgiler : J Doe,44

        Scanner scanner=new Scanner(System.in);

        System.out.println("İsminizi giriniz : ");

        String isim=scanner.nextLine();

        String buyukharf=isim.toUpperCase();


        System.out.println("Soy isminizi giriniz : ");

        String soyIsim=scanner.nextLine();

        String buyukharf2=soyIsim.toUpperCase();

        System.out.println("Yasinizi Giriniz : ");

        int yas=scanner.nextInt();

        System.out.println("girilen bilgiler : "+buyukharf.charAt(0)+" "+soyIsim+" , "+yas);



    }
}
