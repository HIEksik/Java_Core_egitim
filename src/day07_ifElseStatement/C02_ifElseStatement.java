package day07_ifElseStatement;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen karakteri girildigi gibi yazdırın harfi yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");

        // 1. YÖNTEM


        char karakter=scanner.next().charAt(0);

        if (Character.isLowerCase(karakter)){
            System.out.println(Character.toUpperCase(karakter));
        }else {
            System.out.println(karakter);
        }


        //2.YÖNTEM

        if (karakter>='a'&&karakter<='z'){

            System.out.println((char) (karakter-32));
        }else {
            System.out.println(karakter);
        }





    }
}
