package day05_concatenation_operatorler;

import java.util.Scanner;

public class C03_And_Or {
    public static void main(String[] args) {
        // kullanıcıdan not isteyin
        // girilen not  0 ile 100 aradında ise true yoksa false yazdırın 0 ve 100 dahil


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz :");
        int not = scanner.nextInt();

        System.out.println(not >= 0 && not <= 100); // // eger istenen durum bir aralık ile && operatörü kjullanılır

        // eger istenen durum bir aralığın dışında kalan bölge ise 50 - 80
        // ya Or || kullanılır yada  aralıgı yazıp başına ! koyarız


        // not 50 den küçükse veya 80 den büyükse true
        // arasında ise false yazdırın

        System.out.println(not<50 || not>80 );

        // önce istenmeyen durumu yazalım
        // sonra başına ! koyalım
        System.out.println(     !(not>=50 && not<=80)   ); // ! istenmeyen durum




    }
}
