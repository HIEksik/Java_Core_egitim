package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C12_Scanner_slayt {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

      Scanner scanner=new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz : ");
        int sayi1=scanner.nextInt();

        System.out.println("Ikinci sayiyi girinzi : ");
        int sayi2=scanner.nextInt();

        int temp=0;

        temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("Girilen ilk Sayi : "+sayi1);
        System.out.println("Girilen ikinci sayi : "+sayi2);
    }
}
