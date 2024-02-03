package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C01_rakamlarToplami {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi=scanner.nextInt();

        int basSayisi=(sayi+"").length(); // basamak sayısını bulmak için String yaptık ve length kullandık
        int birlerbasamagi=0;
        int rakamlarToplami=0;
        int girilenSayi=sayi; //Kullanıcının girdigi sayi her defasında bölünecegi için sayı kaybolacak onu bir variable ye atadık


        for (int i = 0 ; i <basSayisi ; i++) {
           birlerbasamagi=girilenSayi%10;
           rakamlarToplami+=birlerbasamagi;
           girilenSayi/=10;




        }
        System.out.println("Girilen " + sayi +"sayısının rakamlar toplamı :"+rakamlarToplami);
    }

}
