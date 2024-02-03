package day07_ifElseStatement;

import java.util.Scanner;

public class C07_buyukKucukharf {
    public static void main(String[] args) {
        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz : ");

        char girilenkarakter = scanner.next().charAt(0);

        if (girilenkarakter >= 'A' && girilenkarakter <= 'Z'){
            System.out.println("Girilen karakter büyüktür : ");
        }else {
            System.out.println("Girilen karakter küçüktür");
        }

    }

}
