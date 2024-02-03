package slaytSorular_DataCasting;

import java.util.Scanner;

public class Aziz {
    // kulanıcıdan bir sayi alın
    // sayi pozitif ise sayinin pozitf oldugunu yazdırın
    // sayi pozitifse tek mi yoksa çiftmi oldugunu yazdırın
    // sayi negatifse tekmi yoksa çift mi oldugunu yazdırın
    // sayi hem negatif hem de çift ise 10'un katı olup olmadınıgını yazdırın
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı girin");

        int sayi=scanner.nextInt();

        if (sayi > 0) {
            System.out.println("pozitif");

            if (sayi % 2 == 0) {
                System.out.println(" çift");
            } else {
                System.out.println("tek");
            }
        } else if (sayi < 0) {
            System.out.println("negatif");

            if (sayi % 2 == 0) {
                System.out.println("Sayı çift");

                if (sayi % 10 == 0) {
                    System.out.println("10 un katı");
                } else {
                    System.out.println("10 katı değil");
                }
            } else {
                System.out.println("tek");
            }
        } else {
            System.out.println(" sıfır");
        }
    }
}
