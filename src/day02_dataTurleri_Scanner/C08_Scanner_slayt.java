package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C08_Scanner_slayt {
    public static void main(String[] args) {

        // Kullanicidan bir dikdörtgenin 2 kenar uzunlugunu alip, dikdörtgenin alanini yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Dikdörtgenin 1. kenar uzunluğunu giriniz : ");

        double kenar1=scanner.nextDouble();

        System.out.println("Dikdörtgenin 2. kenar uzunluğunu giriniz : ");

        double kenar2=scanner.nextDouble();

        System.out.println("Dikdörtgenin alanı : "+(kenar1*kenar2));

    }
}
