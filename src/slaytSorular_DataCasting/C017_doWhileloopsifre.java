package slaytSorular_DataCasting;

import java.util.Scanner;

public class C017_doWhileloopsifre {
    public static void main(String[] args) {

        //Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        //kontrol edin ve sifredeki hatalari yazdirin.
        //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //- Sifre kucuk harf icermelidir
        //- Sifre buyuk harf icermelidir
        //- Sifre ozel karakter icermelidir
        //- Sifre en az 8 karakter olmalidir.

        Scanner scanner=new Scanner(System.in);

        String sifre="";

        int flag=10;

        do {
            System.out.print("Lutfen bir sifre giriniz: ");
            sifre = scanner.nextLine();



            char harf=sifre.charAt(sifre.length()-1);
            if (!(harf>='a'&& harf<='z')) {
                System.out.println("Hata: Sifre kucuk harf icermelidir.");
                flag++;
            } if (sifre.contains(" ")) {
                System.out.println("Hata: Sifre buyuk harf icermelidir.");
                flag++;
            } if (sifre.contains("_,*,+")) {
                System.out.println("Hata: Sifre ozel karakter icermelidir.");
                flag++;
            }  if (sifre.length() < 8) {
                System.out.println("Hata: Sifre en az 8 karakter olmalidir.");
                flag++;
            }

        } while (flag>=10);



}
}


