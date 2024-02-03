package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C02_Modules {
    public static void main(String[] args) {

        // Bölme işlminde kalanı bulamamızı sağlar.modules %

        System.out.println(25%8);// 1 kalanı verdi

        System.out.println(25/8);// 3

        // 1262532514 sayısının 8 ile bölümünden kalan kaçtır

        System.out.println(1262532514%8);// 2

        // 52365242 sayısı 113 e tam bölünür mü

        System.out.println(52365242%113);// 25 tam bölünmez

        // 5454566 sayısı 3 e tam bölünür mü

        System.out.println(5454566%3);// 2 tam bölünmüyor

        // kullanıocıdan bir sayı isteyip
        // bir ler basamagını yazdırın

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz : ");

        int sayi=scanner.nextInt();

        System.out.println("girilen sayinin birler basamagı : "+(sayi%10));

        // 375

        System.out.println(375%10); // 5 birler basamağını veriyor
        System.out.println(375/10);//  37 birler basamagı olan 5 hariç , kalan sayilari verir

        System.out.println(37%10);// 7

        System.out.println(37 / 10);// 3

        System.out.println(3%10);//3
        System.out.println(3/10);// 0


    }
}
