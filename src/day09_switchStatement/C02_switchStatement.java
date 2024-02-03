package day09_switchStatement;

import java.util.Scanner;

public class C02_switchStatement {
    public static void main(String[] args) {
        //Kullanicidan ISTQB kisaltmasindaki harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scanner=new Scanner(System.in);

        System.out.println("ISTQB kısaltmasını girin : ");

        char chr=scanner.next().toUpperCase().charAt(0);

        switch (chr){
            case 'I':
                System.out.println("I : International");
                break;
            case 'S':
                System.out.println("S : Software");
                break;
            case 'T':
                System.out.println("T : Testing");
                break;
            case 'Q':
                System.out.println("Q : Qualifications");
                break;
            case 'B':
                System.out.println("B : Board");
                break;

            default:
                System.out.println("Kısaltmada olan harflerden birini yazmalısınız");

        }
    }
}
