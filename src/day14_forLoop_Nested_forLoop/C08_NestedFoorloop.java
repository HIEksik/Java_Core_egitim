package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C08_NestedFoorloop {
    public static void main(String[] args) {
        /*
         Kullanıcıdan satır ve sütunları alıp
        tabloyu oluşturun

        * * * * *
        * * * * *
        * * * * *

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println(" satir sayısını giriniz ");
        int satir=scanner.nextInt();

        System.out.println(" her satirda kaç *  olacağını giriniz");
        int sutun=scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=sutun ; j++) {

                System.out.print("* ");
            }
            System.out.println(" ");
        }



    }
}
