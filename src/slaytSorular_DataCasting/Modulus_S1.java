package slaytSorular_DataCasting;

import java.util.Scanner;

public class Modulus_S1 {
    public static void main(String[] args) {

        // Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 4 basamakli bir sayi giriniz :");

        int sayi1 = scanner.nextInt();

        int birlerasamagi = 0;

        int kalansayi = 0;

        birlerasamagi = sayi1 % 10;
        kalansayi = kalansayi + birlerasamagi;
        sayi1= sayi1 / 10;

        birlerasamagi = sayi1 % 10;
        kalansayi = kalansayi + birlerasamagi;
        sayi1 = sayi1 / 10;

        birlerasamagi = sayi1 % 10;
        kalansayi = kalansayi + birlerasamagi;
        sayi1 = sayi1 / 10;

        birlerasamagi = sayi1 % 10;
        kalansayi = kalansayi + birlerasamagi;
        sayi1 = sayi1 / 10;




        System.out.println("Girilen 4 rakamın toplami : " + kalansayi);


    }
}
