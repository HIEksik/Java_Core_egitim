package day17_whileLoppDowihilelopp;

import java.util.Scanner;

public class C06_MethodileSifreKontrolu {
    public static void main(String[] args) {
        //Kullanıcıdan şifre isteyin
        // şifreyi bir methodda kontrodl edin
        // method da assagıdaki şartları sağlamayan şifrelerde hataları yazdırıp,
        //şifrenin durumunu true veya false sonucunu döndürün
        //    manin methodada kullanıcı
        // geçerli bir şifre yazılıncaya kadar bu işlemi tekrar edin
        // geçerli şifre yazılınca "şifreniz başarıyla kaydedildi" yazdırın
        // şartlar:
        // ilk harf küçük olmali
        // son karakter rakam olmalı
        // sifre boşluk içermemeli
        // uzunlugu en az 10 karakter olmali


        Scanner scanner = new Scanner(System.in);

        String sifre = "";

        while (true) { // loop herzaman çalışacak taki ifte true gelene kadar şifre başarılı olana kadar
            // looğp sonsuz oldu YANLIŞ ŞİFRE GİRDİGİMİZ MÜDDETÇE LOOP ÇALIŞACAK SONSUZ LOOP YAPTIK
            System.out.println("Lütfen şifrenizi girin"); // şifreyi aldık
            sifre = scanner.nextLine();

            boolean sonuc= sifreKontrol(sifre);// true yada false dönecek // kaydettik

            if (sonuc){ // kontrol ettin
                System.out.println("Şiftreniz başarı ile kaydedildi");
                break;
            }

        }



    }

    public static boolean sifreKontrol(String sifre) {


        int flag = 0;


        // ilk harf küçük olmali
        char ilkharf = sifre.charAt(0);
        if (!(ilkharf >= 'a' && ilkharf <= 'z')) {
            System.out.println("ilk harf küçük olmali");
            flag++;
        }
        //son karakter rakam olmalı
        char sonkarakter = sifre.charAt(sifre.length() - 1);
        if (!(sonkarakter >= '0' && sonkarakter <= '9')) {
            System.out.println("son karakter rakam olmalı");
            flag++;
        }
        //sifre boşluk içermemeli
        if (sifre.contains(" ")) {
            System.out.println("sifre boşluk içermemeli");
            flag++;
        }
        //uzunlugu en az 10 karakter olmali
        if (sifre.length() < 10) {
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag++;

        }

        if (flag==0){
            return true;

        }else {
            return false;
        }

    }


}
