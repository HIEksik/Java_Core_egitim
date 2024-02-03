package slaytSorular_DataCasting;

import java.util.Scanner;

public class Aziz222 {

    public static void main(String[] args) {
        // kullanıcıdan bir şifre alın
        // girilen şifre küçük harfle başlamalı
        // girilen şifre boşluk içermemeli
        // girilen şifre nokta içermeli
        // girilen şifrenin son karakteri rakam olmalı
        // eğer bütün şartlar sağlanırsa şifre başarıyla kaydedildi yazdırın
        // eğer şartlardan biri bile sağlanmazsa tekrardan şifre isteyin

        Scanner scanner=new Scanner(System.in);


        while (true){
            System.out.println("Şifre girin");
            String sifre=scanner.nextLine();
            char sonharf=sifre.charAt(sifre.length()-1);

            if (sifre.charAt(0)=='A'&&sifre.charAt(0)=='Z'){
                System.out.println("girilen şifre küçük harfle başlamalı ");
            }if (sifre.contains(" ")){
                System.out.println("girilen şifre boşluk içermemeli");
            }if (!sifre.contains(".")){
                System.out.println("girilen şifre nokta içermeli");
            }if (!(sonharf>='0' && sonharf<='9')){
                System.out.println(" girilen şifrenin son karakteri rakam olmalı");
            }else {
                System.out.println("Şifye kaydedildi");
            }
        }
    }
}
