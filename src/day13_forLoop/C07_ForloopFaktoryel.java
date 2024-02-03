package day13_forLoop;

import java.util.Scanner;

public class C07_ForloopFaktoryel {
    public static void main(String[] args) {
        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 20 den küçük bir sayı giriniz ");

        int sayi=scanner.nextInt();

        long faktoryel=1;

        for (int i = 1; i <=sayi ; i++) {
            faktoryel*=i;
        }
        System.out.println("Girilen sayının faktöriyeli : "+faktoryel);



    }

}
