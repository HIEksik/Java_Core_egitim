package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C10_Nested_forloop {
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

        for (int i = 1; i <=satir ; i++) { // satır i

            for (int j = 1 ; j <=i ; j++) { // sutun j // satırdaki yıldız sayısını kontrol eder

                System.out.print("* " );
            }
            System.out.println(" ");
        }





    }
}
