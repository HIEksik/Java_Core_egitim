package day09_switchStatement;

import java.util.Scanner;

public class C01_IfelseStatement {
    public static void main(String[] args) {

        //Kullanicidan ISTQB kisaltmasindaki harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scanner=new Scanner(System.in);

        System.out.println("ISTQB kısaltmasını girin : ");

        char chr=scanner.next().toUpperCase().charAt(0);

        if (chr=='I'){
            System.out.println(" I : International");
        } else if (chr=='S') {
            System.out.println("S : Software");
        } else if (chr=='T') {
            System.out.println("T : Testing");

        } else if (chr=='Q') {
            System.out.println("Q : Qualifications ");
        } else if (chr=='B') {
            System.out.println("B: Board");
        }else {
            System.out.println("Lütfen bu harflerden birini giriniz ISTQB : ");
        }

    }
}
