package day06_If_Statements;

import java.util.Scanner;

public class C08_ifElseSusluparantezkullanimi {
    public static void main(String[] args) {

        // lkullanıcıdan iki tam sayi alın
        // eger sayi1 sayi2 den büyükse sayi1 i bir azaltıp ,
        // sayi1 sayi2 den büyük degilse sai1 i 3 ile çartın sayi2 yi 2 ile çarpın
        // sayi1 ve sayi2 nin son degerlerini yazdırın

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen iki sayi giriniz : ");

        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        /*
        Eger if ve else den sonra süslü parantez kullanmazsak Java if body ve else body olarak ilk noktalı virgüle kadar
        olan kısmı alır.Süslü parantez kullanılmazsa sadece bir satır alır.

        Eger if ve else bodyleri tek bir satırdan oluşuyorsa {} parantez kullanmasakta olur.
         Ama if body si de veya else body sinde bir satırdan fazla kod varsa mutlaka {} kullanmalıyız
         */

        if (sayi1>sayi2)  sayi1--;

        else sayi1*=3;
            sayi2*=2;

            System.out.println("Sayi1 : "+sayi1+" "+"Sayi2 : "+sayi2);

    }
}
