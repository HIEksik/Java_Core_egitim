package day09_switchStatement;

import java.util.Scanner;

public class C03_haftaiciGunlari {
    public static void main(String[] args) {

        // Kullanıcıdan gün ismini isteyin günleri girilen günün hafta içi veya hafta sonu olduğunu yazdırın.


        /*
        long, double, float, boolean veri tipleri kullanılmaz
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen gün ismini giriniz");

        String gunismi = scanner.next().toLowerCase();

        switch (gunismi) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Hafta içi ");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lütfen geçerli gün giriniz");
        }

    }
}
