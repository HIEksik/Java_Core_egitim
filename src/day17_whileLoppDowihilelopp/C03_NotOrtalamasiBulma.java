package day17_whileLoppDowihilelopp;

import java.util.Scanner;

public class C03_NotOrtalamasiBulma {
    public static void main(String[] args) {
        // Bir öğretmenden not ortalaması bulmak için notları alın
        // ögretmen işlemi bitirmek için negatif bir sayi girmelidir
        // negatif sayı girdiginde toplam kaç not girdigini
        // not ortalamasının kaç oldugunu
        // ve en yüksek notu yazdırın


        Scanner scanner=new Scanner(System.in);

        int not=0;
        int toplam=0;
        int sayac=0;
        int enyukseknot=0;


        while (not>=0){

            System.out.println("Lütfen notları giriniz \n çıkmak için negatig not giriniz ");
            not=scanner.nextInt();
            if (not>=0){
                toplam+=not;
                sayac++;
                if (not>enyukseknot) enyukseknot=not;
            }

        }
        System.out.println("Girilen not sayısı "+sayac+" girilen not ortalaması "+toplam/sayac+" en yüksek not"+enyukseknot);
    }
}
