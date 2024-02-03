package day08_nestedIfElseStatement;

import java.util.Scanner;

public class C08_ternary {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 1. kenarı girin ");
        double kenar1 = scanner.nextDouble();

        System.out.println("Lütfen 2. kenarı girin ");
        double kenar2 = scanner.nextDouble();

        System.out.println("Lütfen 3. kenarı girin ");
        double kenar3 = scanner.nextDouble();


        System.out.println(kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0 ? "Es kenar ucgen " : " Eskenar degil ");

    }
}
