package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C07_Nestedfoorloop {
    public static void main(String[] args) {

        /*
        Kullanıcıdan satır ve sütunları alıp
        tabloyu oluşturun

        2 3 4 5 6   // 1 satır 2 sutun 1+1=2  1 satır 3 1+3=4
        3 4 5 6 7
        4 5 6 7 8
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println(" satir sayısını giriniz ");
      int satir=scanner.nextInt();

        System.out.println(" her satirda kaç sayi olacağını giriniz");
      int sutun=scanner.nextInt();


        for (int i = 1 ; i <=satir ; i++) { // satırlar

            for (int j = 1; j <=sutun ; j++) { // sutunlar
                System.out.print(i+j + " ");
            }
            System.out.println("");
        }




    }
}
