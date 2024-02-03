package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C09_tekrar {
    public static void main(String[] args) {
         /*
        1  / bir sayi var
        1 2 / 2 sayi var
        1 2 3 / 3 sayı var
        1 2 3 4 / 4 sayı var
        1 2 3 4 5 / 5 sayı var

        Kullanıcıdan satır sayısını alıp şekli çiziniz

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz");
        int satir=scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }




    }
}
