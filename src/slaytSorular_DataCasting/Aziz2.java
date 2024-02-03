package slaytSorular_DataCasting;

import java.util.Scanner;

public class Aziz2 {
    public static void main(String[] args) {
        // kullanıcıdan gün ismi isteyin
        // gün hafta sonu ise "tatil yapabilirsin yazdırın"
        // gün hafta içi isi "calisman lazım" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("gün girin");

        String gun=scanner.nextLine();

        if (gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("Çalışmanlazım");
        }if (gun.equalsIgnoreCase("Sali")){
            System.out.println("Çalışmanlazım");
        }if (gun.equalsIgnoreCase("Carsamba")){
            System.out.println("Çalışmanlazım");
        }if (gun.equalsIgnoreCase("Persembe")){
            System.out.println("Çalışmanlazım");
        }if (gun.equalsIgnoreCase("Cuma")){

            System.out.println("Çalışmanlazım");
        }if (gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("TAtil");
        }if (gun.equalsIgnoreCase("Pazar")){
            System.out.println("Tatil");
        }else {
            System.out.println("Geçersiz gün");
        }




        switch (gun) {
            case "pazartesi":
                break;
            case "sali":
                break;
            case "carsamba":
                break;
            case "persembe":
                break;
            case "cuma":
                System.out.println("Çalışman lazım ");
                break;
            case "cumartesi":
                break;
            case "pazar":
                System.out.println("Tatil yapabilirsin");
                break;
            default:
                System.out.println("Lütfen geçerli gün giriniz");
        }


    }
}
