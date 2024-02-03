package day17_whileLoppDowihilelopp;

import java.util.Scanner;

public class C01_Whilelopp {
    public static void main(String[] args) {
        // Kullanıcıdan başlangız ve bitiş degerlrini alın
        // başlangıc ve bitiş dahil olarak
        // bu iki sayı arasındaki tüm tam sayıları toplayın

       Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen iki sayı giriniz");

        int baslangic=scanner.nextInt();
        int bitis=scanner.nextInt();

        int toplam=0;

        while (baslangic<=bitis){

            toplam+=baslangic;
            baslangic++;
        }

        System.out.println(toplam);
    }
}
