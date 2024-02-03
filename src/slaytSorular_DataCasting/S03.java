package slaytSorular_DataCasting;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz : ");

        int sayi=scanner.nextInt();

        byte byt = (byte) sayi;

        System.out.println("Girilen sayi : "+byt);

    }
}
