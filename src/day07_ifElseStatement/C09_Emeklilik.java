package day07_ifElseStatement;

import java.util.Scanner;

public class C09_Emeklilik {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner=new Scanner(System.in);


        System.out.println("Lütfen cinsiyetinizi giriniz :");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz :");
        int yas=scanner.nextInt();




        if (cinsiyet=='E'&& yas>=65){
            System.out.println("Emekli olabilirsiniz ");
        } else if (cinsiyet == 'E') {
            System.out.println("Emeklilik için "+(65-yas)+" Yıl çalışmalısınız ");
        }else if (cinsiyet=='K'&& yas>=60){
            System.out.println("Emekli olabilirsiniz ");
        } else if (cinsiyet == 'K') {
            System.out.println("Limekiln için "+(60-yas)+" Yıl çalışmalısınız ");
        }else {
            System.out.println("Hatalı giriş ");
        }

    }
}
