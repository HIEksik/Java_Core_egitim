package slaytSorular_DataCasting;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
       // Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        // sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");

        int sayi=scanner.nextInt();

        if (sayi%3==0){
            System.out.println("Uc ile bolune bilen sayi");
        }if (sayi%5==0){
            System.out.println("Bes ile bolune bilen sayi");
        }

    }
}
