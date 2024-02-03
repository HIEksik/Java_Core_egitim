package slaytSorular_DataCasting;

import java.util.Scanner;

public class C017_whileloop2 {
    public static void main(String[] args) {
        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");
       int sayi=scanner.nextInt();


       int toplam=0;
       int birler=0;

       while (sayi!=0){

          birler=sayi%10;
           toplam+=birler;
           sayi/=10;

       }
        System.out.println(toplam);

    }
}
