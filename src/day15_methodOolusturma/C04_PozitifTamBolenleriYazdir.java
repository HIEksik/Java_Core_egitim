package day15_methodOolusturma;

import java.util.Scanner;

public class C04_PozitifTamBolenleriYazdir {
    public static void main(String[] args) {
        //Kullanicidan main method icinde bir tamsayi alin.
        //         Girilen sayinin pozitif tam bolenlerini yan yana yazdıran
        //       bir method olusturun.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Pozitif bir tam sayi giriniz");
        int sayi=scanner.nextInt();

        pozitfBolenleriYazdir(sayi); // parantezler koldur call içindeki ise argument tir methodu kullanmak için argument
                                     // veriyoruz bu parametre ile eşleşiyor ve method çalışıyor

        pozitfBolenleriYazdir(640);

       // pozitfBolenleriYazdir("sanane"); // parametre degeri neyse onu yazmak gerekiyor int olana Strin veya boolean yazılmaz
        //pozitfBolenleriYazdir(true);

        pozitfBolenleriYazdir('z'); // 1 2 61 122  ASCII tablosundan aldı
        /*

        Method kolda kullanılan argument ile method parametreleri ile uyumlu olmalıdır
        eger argument ve parametreler uyumlu olmazsa CTE oluşur kod çalışmaz

         */

    }
public static void pozitfBolenleriYazdir(int sayi){ // parantez içindeki kod parametre dir bir tane var int

    for (int i = 1; i <=sayi ; i++) {

        if (sayi%i==0){
            System.out.print(i+" ");
        }
    }
    System.out.println("");

}





}
