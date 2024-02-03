package day40_exceptions;

import java.util.Scanner;

public class C03_ExceptionSoru {
    public static void main(String[] args) {

        // Kullanıcıya istedigi kadar sayı girmesini söyleyin
        // girdigi sayilardan pozitif olanları toplayın
        // negatif sayi veya 0 girerse toplamaya eklemeyin
        // toplama işlemini bitirmek için kullanıcı Q ya basmalıdır
        // kullanıcı Q ya bastığında toplam kaç pozitif sayi girdigini ve toplamlarının kaç oldugunu yazdırın

        int toplananSayiAdedi=0;
        int toplam=0;
        int girilenSayi=0;
        String girilenHarf="a"; // q dışında herhangi bir deger atatdım

        Scanner scanner=new Scanner(System.in);


        while (!girilenHarf.equalsIgnoreCase("Q")){

            System.out.println("Lütfen toplanmak üzere Pozitif tam sayilar giriniz," +
                    "\n Bitirmek için Q ya basınız");

            try {
                girilenSayi=scanner.nextInt();

                if (girilenSayi>0){
                    toplam+=girilenSayi;
                    toplananSayiAdedi++;
                }else {
                    System.out.println("Negatif sayilar veya 0 işleme dahil edilmez");
                }
            } catch (Exception e) {

                girilenHarf=scanner.next();
                if (!girilenHarf.equalsIgnoreCase("q")){
                    System.out.println("Lütfen bir tam sayı yazın veya Q ya basın");
                }
            }

        }

        System.out.println(toplananSayiAdedi+" adet pozitif yazı girildi : "+toplam);

    }
}
