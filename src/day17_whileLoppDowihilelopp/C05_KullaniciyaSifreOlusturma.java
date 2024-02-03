package day17_whileLoppDowihilelopp;

import java.util.Scanner;

public class C05_KullaniciyaSifreOlusturma {
    public static void main(String[] args) {
        //Kullanıcıdan şifre isteyin
        // assagıdaki şartları sağlamayan şifrelerde hataları yazdırıp,
        //kullanıcının yeni şifre girmesini isteyin
        // geçerli bir şifre yazılıncaya kadar bu işlemi tekrar edin
        // geçerli şifre yazılınca "şifreniz başarıyla kaydedildi" yazdırın
        // şartlar:
        // ilk harf küçük olmali
        // son karakter rakam olmalı
        // sifre boşluk içermemeli
        // uzunlugu en az 10 karakter olmali

        Scanner scanner=new Scanner(System.in);
        String sifre="";
        int flag=7; // sıfır dışında bir deger atadık döngü çalışsındiye marş verdik


        while (flag>0){

            flag=0; // döngünün için de flagg ı sıfırladık

            System.out.println("Lütfen çşifre giriniz");
            sifre=scanner.nextLine();
            // ilk harf küçük olmali
            char ilkharf=sifre.charAt(0);
            if (!(ilkharf>='a'&&ilkharf<='z')){
                System.out.println("ilk harf küçük olmali");
                flag++;
            }
            //son karakter rakam olmalı
            char sonkarakter=sifre.charAt(sifre.length()-1);
            if (!(sonkarakter>='0' && sonkarakter<='9')){
                System.out.println("son karakter rakam olmalı");
                flag++;
            }
            //sifre boşluk içermemeli
            if (sifre.contains(" ")){
                System.out.println("sifre boşluk içermemeli");
                flag++;
            }
            //uzunlugu en az 10 karakter olmali
            if (sifre.length()<10){
                System.out.println("uzunlugu en az 10 karakter olmali");
                flag++;
            }

        }

        System.out.println("şifreniz başarıyla kaydedildi");
    }
}
