package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C09_Nested_forLoop {
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
        System.out.println(" satir sayısını giriniz ");
        int satir=scanner.nextInt();

        // sadece satır sayısı var burda
        // satır her zaman dış loop a yazılır sutun iç loop a yazılır
        for (int i = 1; i <=satir ; i++) {//  i satır sayısı
            for (int j = 1; j <=i ; j++) { // j  sutun sayısı da satıra bağlı // i ye kadar gitsin i kaç olursa okadar sutun yazsın
                System.out.print(j+" ");   // tablo her zaman j üzerinden gitmiş
            }
            System.out.println("");
        }


    }
}
