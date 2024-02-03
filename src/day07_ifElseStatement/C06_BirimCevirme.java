package day07_ifElseStatement;

import java.util.Scanner;

public class C06_BirimCevirme {
    public static void main(String[] args) {
        //Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen Km yi giriniz : ");
        double mesafe=scanner.nextDouble();


        System.out.println("Lütfen çavirmek istediginiz birimi giriniz : ");
        String birim=scanner.next();

        if (birim.equalsIgnoreCase("metre")){
            System.out.println("Girilen mesafenin metre cinsinden degeri : "+mesafe*1000+"  metre dir");

        } else if (birim.equalsIgnoreCase("santimetre")) {
            System.out.println("Girilen mesafenin metre cinsinden degeri : "+mesafe*100000+"  Santim dir");

        }else {
            System.out.println("İstediginiz mesafe sistemde kayıtlı degildir");
        }


    }

}
