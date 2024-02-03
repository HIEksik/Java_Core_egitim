package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C01_tekrar {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz ");
        int sayi=scanner.nextInt();

        int bassayisi=(sayi+"").length();
        int birlerbasamagi=0;
        int rakamlarToplami=0;
        int girilensayi=sayi;
        for (int i = 0; i < bassayisi; i++) {

            birlerbasamagi=girilensayi%10;
            rakamlarToplami+=birlerbasamagi;
            girilensayi/=10;
        }
        System.out.println("Girilen"+sayi+"syinin rakamlar toplamı :"+rakamlarToplami);
    }
}
