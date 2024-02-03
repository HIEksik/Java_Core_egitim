package day07_ifElseStatement;

import java.util.Scanner;

public class C05_Bolunebilme {
    public static void main(String[] args) {
        // Kullanıcıdan pozitif bir tam sayı alın 3 ile bölüne biliyorsa üçün katı
        // 5 ile bölüne biliyorsa 5 in katı
        // hem 3 hemde 5 ile bölünüyorsa " süper sayı " yazdırın

        /*

        Seçici olacak olan seçim başta yazılır .. kodlaR EN ÜSTTÜN BAŞLAR OKUNMAYA .. ELEK GİBİ

        eger şartlar bir biri ile ilgili ise en önce en seçici olanı yazmalıyız

        eger ifade else ile bitmezse tüm if else ler tüm degerleri kapsamıyor demektir.
        yani bazı degerleri girdigimizde kod çalışır ama hiç bir sonuç üretmez

         */
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");
        int sayi=scanner.nextInt();

        if (sayi<0){
            System.out.println("Lütfen pozitif bir sayi giriniz");
        }else if (sayi%3==0 && sayi%5==0) {
            System.out.println("Süper sayi");
        }else if (sayi%3==0) {
            System.out.println("Sayi 3 e tam bölünür");
        } else if (sayi%5==0) {
            System.out.println("Sayi 5 e tam bölünüyor");

        }
    }
}
