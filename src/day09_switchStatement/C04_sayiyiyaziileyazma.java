package day09_switchStatement;

import java.util.Scanner;

public class C04_sayiyiyaziileyazma {
    public static void main(String[] args) {
        //Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki basamaklı sayı giriniz : ");
        int girilensayi = scanner.nextInt();

        int birlerbasamagi = girilensayi % 10; // birler basamagini bulma

        int onlarbasamagi = girilensayi / 10;// onlar basamagini bulma

        switch (onlarbasamagi) {
            case 1:
                System.out.print("on");
                break;

            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kırk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Atmış");
                break;
            case 7:
                System.out.print("Yetmiş");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;


        }
        switch (birlerbasamagi) {
            case 0:
                break;
            case 1:
                System.out.print("bir");
                break;

            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("üç");
                break;
            case 4:
                System.out.print("dört");
                break;
            case 5:
                System.out.print("beş");
                break;
            case 6:
                System.out.print("altı");
                break;
            case 7:
                System.out.print("yedi");
                break;
            case 8:
                System.out.print("sekiz");
                break;
            case 9:
                System.out.print("dokuz");
                break;


        }

    }
}
