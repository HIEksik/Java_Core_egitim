package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C01_tekrar2 {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi=scanner.nextInt();

        int basSayiisi=(sayi+"").length();
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int girilenSayi=sayi;

        for (int i = 0; i < basSayiisi; i++) {
            birlerBasamagi=girilenSayi%10;
            rakamlarToplami+=birlerBasamagi;
            girilenSayi/=10;
        }
        System.out.println("Girilen sayi :"+sayi+"Rakamlar toplamı :"+rakamlarToplami);
    }
}
