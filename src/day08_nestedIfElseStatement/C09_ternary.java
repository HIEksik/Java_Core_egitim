package day08_nestedIfElseStatement;

import java.util.Scanner;

public class C09_ternary {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen iki tam sayı giriniz ");

       double sayi1=scanner.nextDouble();

        double sayi2=scanner.nextDouble();

        System.out.println(sayi1>sayi2 ? " " +sayi2:sayi1);

    }
}
