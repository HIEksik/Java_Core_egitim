package slaytSorular_DataCasting;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {

        //Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen ondalikli bir sayi girin : ");

        double dbl=scanner.nextDouble();

        System.out.println("Lütfen bir tam sayi girin : ");

        int sayi=scanner.nextInt();



        System.out.println("Islem sonucu : "+(int)(sayi/dbl));

    }
}
