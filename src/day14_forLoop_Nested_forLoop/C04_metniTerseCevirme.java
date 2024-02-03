package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C04_metniTerseCevirme {
    public static void main(String[] args) {


        //Kullanicidan bir String isteyin ve String’i tersine cevirip
        //kaydedin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz ");

        String metin=scanner.nextLine();

        String tersMetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin+=metin.charAt(i);
        }

        System.out.println(tersMetin);

        // Kullanıcının girdigi metnin patidrom olup olmadığını yazdırın

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin palidrom");
        }else {
            System.out.println("Girilen metin palidrom degil");
        }

    }
}
