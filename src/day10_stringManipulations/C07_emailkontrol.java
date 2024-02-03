package day10_stringManipulations;

import java.util.Scanner;

public class C07_emailkontrol {
    public static void main(String[] args) {

        // Kullanıcıdan email isteyin
        // eger @ işareti içermiyorsa "Yanlış giriş"
        // eger @ gmail.com içermiyorsa " mail gmail olmali"
        // email  @ gmail.com ile bitmiyorsa " geçersiz mail "
        // email boşluk içeriyorsa " yazım hatası "
        // eger hata yoksa "email kaydedildi"
        // yazdırın

        // bağımlı olduğu için if else kullanılacak

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen Email adresinizi giriniz ");
        String email=scanner.nextLine();

        if (!email.contains("@")){
            System.out.println("yanlış giriş");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("Mail gmail olmalı");

        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Geçersiz mail");

        } else if (email.contains(" ")) {
            System.out.println("Yazım hatası");

        }else {
            System.out.println("Mail kaydedildi");
        }


    }
}
