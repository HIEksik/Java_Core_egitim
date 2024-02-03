package day08_nestedIfElseStatement;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {

        //Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayi giriniz ");

        int sayi = scanner.nextInt();

        System.out.println(sayi % 5 == 0 ? "sayi 5 in tam katı":"sayi 5 in katı değil");


    }
}
