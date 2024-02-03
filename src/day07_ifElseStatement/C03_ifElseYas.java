package day07_ifElseStatement;

import java.util.Scanner;

public class C03_ifElseYas {
    public static void main(String[] args) {
        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen yasinizi giriniz : ");
        int yas=scanner.nextInt();

        if (yas>=65 ){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Emekli olmak için : "+(65-yas)+" yıl çalışmalısın ");
        }
    }
}
