package day15_methodOolusturma;

import java.util.Scanner;

public class C03_TamBolenlerSayisi {
    public static void main(String[] args) {

        //Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri sayisini bulup
        // bize donduren bir method olusturun.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scanner.nextInt();

        System.out.println(pozitifTambolenSayisi(sayi));

    }

    public static int pozitifTambolenSayisi(int sayi){

        // 20 ==> 1 , 2 , 4, 5, 10 20 sayisinin 6 tane pozitif tam böleni varmış

        int sayac=0;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                sayac++;
            }

        }

        return sayac;

    }

}
