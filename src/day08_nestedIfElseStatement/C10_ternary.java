package day08_nestedIfElseStatement;

import java.util.Scanner;

public class C10_ternary {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz :");
        int sayi1 = scanner.nextInt();

        System.out.println(sayi1=sayi1<0?-sayi1:sayi1);


    }
}
