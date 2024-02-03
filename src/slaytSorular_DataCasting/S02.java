package slaytSorular_DataCasting;

import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {

        // Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz : ");

        char chr=scanner.next().charAt(0);

        System.out.println("Girilen harften sonraki üç harf : "+chr);

        System.out.println("Girilen harften sonraki 1 harf : "+(char)(chr+1));
        System.out.println("Girilen harften sonraki 2 harf : "+(char)(chr+2));
        System.out.println("Girilen harften sonraki 3 harf : "+(char)(chr+3));

    }
}
