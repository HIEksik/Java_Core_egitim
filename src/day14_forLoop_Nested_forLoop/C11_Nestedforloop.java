package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C11_Nestedforloop {
    public static void main(String[] args) {


        /*

        * * * * * * * *
        * * * * * * *
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *

        Kullanıcıdan satır sayısını alıp şekli çiziniz

         */


        Scanner scanner=new Scanner(System.in);
        System.out.println(" satir sayısını giriniz ");
        int satir=scanner.nextInt();
        int sutun=0;


        for (int i =satir ;    i >=1     ; i-- ) {

            for (int j = 1;    j <=i     ; j++ ) {

                System.out.print("* ");

            }
            System.out.println(" ");
        }




    }
}
