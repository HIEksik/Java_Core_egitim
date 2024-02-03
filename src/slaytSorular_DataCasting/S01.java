package slaytSorular_DataCasting;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {

        //Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
        //yazin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen birinci sayiyi giriniz : ");
        int sayi1=scanner.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz : ");
        int sayi2=scanner.nextInt();
        System.out.println("Lütfen ücüncü sayiyi giriniz : ");
        double sayi3=scanner.nextInt();

        double ort=0;


        ort = (sayi1+sayi2+sayi3)/3;

        System.out.println("Girilen uc sayinin ortalamasi : "+ort);

    }
}
