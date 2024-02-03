package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C03_Stringiterstenyazma {
    public static void main(String[] args) {
        //(interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");

        String metin=scanner.nextLine().toUpperCase();


        for ( int i = metin.length()-1      ; i >=0      ; i-- ) { // önce sondaki harfi yazdırıyoruz -- olarak yazdırıyoruz

            System.out.print(metin.charAt(i));
        }






    }
}
