package day11_stringManipulatiions;

import java.util.Scanner;

public class C03_IndexOfsoru {
    public static void main(String[] args) {
        // Kullanıcıdan bir cümle ve cümlede aranacak metin isteyin
        // cümle ve metni karşılaştırıp
        // Aşşagıdaki 3 durumdan birini yazdırın
        // 1 verilen metin cümlede kullanılmamış
        // 2 verilen metin cümlede sadece bir kere kullanılmış
        // 3 verilen metin cümlede birden fazla kere kullanılmış

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz ");
        String cumle = scanner.nextLine();

        System.out.println("Lütfen aranacak metni giriniz :");
        String metin=scanner.nextLine();

        if (!cumle.contains(metin)){
            System.out.println("Verilen metin cümlede kullanılmamış");
        } else if (cumle.indexOf(metin)==cumle.lastIndexOf(metin)) {
            System.out.println("verilen metin cümlede sadece bir kere kullanılmış");
        }else {
            System.out.println("verilen metin cümlede birden fazla kere kullanılmış");
        }


    }
}
