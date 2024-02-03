package day12_stringManipulation;

import java.util.Scanner;

public class C08_stringManipulations {
    public static void main(String[] args) {
      // Kullanicidan alinan bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina  :) ekleyin,
        // String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz ");

        String metin=scanner.nextLine();



        if (metin.length()%2==0){ // uzunluk çiftse

            metin=metin.substring(0,metin.length()/2)+ ":)" + metin.substring(metin.length()/2);

            System.out.println(metin);


        }else { // uzunluk tekse
            metin=metin.substring(0,metin.length()/2)+ ":(" +metin.substring((metin.length()+1)/2);
            System.out.println(metin);
        }








    }
}
