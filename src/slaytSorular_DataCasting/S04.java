package slaytSorular_DataCasting;

import java.util.Scanner;

public class S04 {
    public static void main(String[] args) {

        //Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen Ondalikli bir sayi biriniz : ");

        double sayi1=scanner.nextDouble();

        System.out.println("Lütfen Ondalıkli ikinci sayiyi giriniz : ");

        double sayi2=scanner.nextDouble();

        int bolum= (int) (sayi2/sayi1);

        System.out.println("Islem sonucu tamsayısı : "+bolum);


    }
}
