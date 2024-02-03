package slaytSorular_DataCasting;

import java.util.Scanner;

public class C10_manipulations {
    public static void main(String[] args) {
        //kullanicidan bir mail alin
        //- mail @ icermiyorsa "gecersiz mail"
        //- mail @gmail.com icermiyorsa, "mail gmail olmali"
        //- mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen mail giriniz");
        String mail=scanner.nextLine();

        if (!mail.contains("@")){
            System.out.println("Geçersiz mail");
        } else if (!mail.contains("gmail.com")) {
            System.out.println("Mail gmail olmalı");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("Mailde yazım hatası var");

        }else {
            System.out.println("Başarılı");
        }
    }
}
