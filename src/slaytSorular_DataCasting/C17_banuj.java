package slaytSorular_DataCasting;

import java.util.Scanner;

public class C17_banuj {

    public static void main(String[] args) {

        //  kullanıcıdan alınan iki sayının toplamını yazdıran bir method yazdın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz ");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

     ikiSayininToplami(sayi1,sayi2);


    }

    public static void ikiSayininToplami(int sayi1,int sayi2){

        System.out.println("Girilen iki tam sayının toplamı : "+(sayi1+sayi2));

    }





}
