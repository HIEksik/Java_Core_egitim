package slaytSorular_DataCasting;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {

        //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen notu giriniz");

        int not=scanner.nextInt();

        if (not>=50){
            System.out.println("Sinifi gectin");
        }if (not<50){
            System.out.println("Malesef kaldın");
        }

    }
}
