package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdan ismini alıp büyük harf olarak yazdırın?

        // 1. adım : Scanner objesi olusturmak

        Scanner scanner=new Scanner(System.in);

        // 2.Adim : kullanıcıdan istediginiz bilgiyi kullanıcıya bilgi olarak konsolda yazdırın

        System.out.println("Lutfen isminizi giriniz");

        // 3.adım : istediğiniz bilgiye uygun bir variable oluşlturun
        // scanner objesi ve uygun next() ile bilgiyi kullanıcıdan alip
        // olustudugunuz variable'a atayin


        String girilenIsim= scanner.nextLine();

        //next() sadece bir kelime alabilir, nextLine() butun girilen satiri alir

        System.out.println(girilenIsim.toUpperCase());


    }
}
