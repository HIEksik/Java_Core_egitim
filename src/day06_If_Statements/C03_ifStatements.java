package day06_If_Statements;

import java.util.Scanner;

public class C03_ifStatements {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz : ");

        int sayi1=scanner.nextInt();

        if (sayi1%5==0){
            System.out.println("Sayi 5 in tam katı");
        }

    }
}
