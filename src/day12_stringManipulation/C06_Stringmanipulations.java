package day12_stringManipulation;

import java.util.Scanner;

public class C06_Stringmanipulations {
    public static void main(String[] args) {
        //Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir şifre girin");
        String sifre=scanner.nextLine();

        int flag=10;

        // bagımsız if cümleleri ile soruyu çözecegiz çünkü if else if tek hata bulup sorunu yazacaktı
        // if if if bagımsız da ise hepsini kontrol edecek Flag oluşturarak başlayalım

       // ilk harf kucuk harf olmali

        char ilkHarf=sifre.charAt(0);


        if (!(ilkHarf>='a'&& ilkHarf<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }
        //- son karakter rakam olmali
        char sonKarakter=sifre.charAt(sifre.length()-1);

        if (!(sonKarakter>='0'&&sonKarakter<='9')){
            System.out.println("son karakter rakam olmali");
            flag++;
        }

        //- sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag++;

        }
        // uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){
            System.out.println("zunlugu en az 10 karakter olmali");
            flag++;
        }
        // şidi flag ı yazacagız // flag artarsa hataları ekrana yazacak
        // bagımsız if yaptık flag ile ekrana hepsini yazması için
        // şifre başarılı yazması için de flag hiç artmadığı içöin ilk degerine eşit yazdık
        if (flag==10){
            System.out.println("sifre basariyla kaydedildi");
        }

    }
}
