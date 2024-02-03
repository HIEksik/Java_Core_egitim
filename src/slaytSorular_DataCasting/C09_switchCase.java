package slaytSorular_DataCasting;

import java.util.Scanner;

public class C09_switchCase {
    public static void main(String[] args) {
        //1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir rakam giriniz :");

        int rakam=scanner.nextInt();

        switch (rakam){

            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir");
           break;
            case 2:
                System.out.println("İki");
           break;
            case 3:
                System.out.println("Üç");
             break;
            default:
                System.out.println("Yanlış karakter");

        }

    }
}
