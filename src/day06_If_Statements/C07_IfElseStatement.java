package day06_If_Statements;

import java.util.Scanner;

public class C07_IfElseStatement {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        // “Eskenar ucgen” yazdirin.
        // Degilse "Eskenar degil" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen uc genin kenar uzunluklarını giriniz : ");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0) {
            System.out.println("Es kenar ucgen");
        } else {
            System.out.println("Es kenar degil");
        }

    }

}
