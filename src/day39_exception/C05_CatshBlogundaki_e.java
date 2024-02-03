package day39_exception;

import java.util.Scanner;

public class C05_CatshBlogundaki_e {
    public static void main(String[] args) {
        // Kullanıcıdan bir cumle ve bir sayi isteyin
        // kullanicinin verdigi sayiyi index olarak kabul edip
        // cümlede o index teki karakteri yazdırınü


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz...");

        String cumle=scanner.nextLine();

        System.out.println("Lütfen bir sayi giriniz");

        int index=scanner.nextInt();

        try {
            System.out.println(cumle.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Girilen index cumlenin sınırları disinda");
        }

    }
}
