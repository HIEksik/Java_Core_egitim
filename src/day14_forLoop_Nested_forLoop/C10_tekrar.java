package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C10_tekrar {
    public static void main(String[] args) {
           /*
        *
        * *
        * * *
        * * * *
        * * * * *

        Kullanıcıdan satır sayısını alıp şekli çiziniz

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println(" satir sayısını giriniz ");
        int satir=scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 0; j <=i ; j++) {

                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }
}
