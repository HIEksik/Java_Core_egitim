package day07_ifElseStatement;

import java.util.Scanner;

public class C08_Vucukkitleendexi {
    public static void main(String[] args) {
        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen kilonuzu giriniz : ");
        double kilo=scanner.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz : ");
        double boy=scanner.nextDouble();

        double toplam=(kilo*10000)/(boy*boy);

        System.out.println("Vücut kitle endeksi : "+toplam);



       if (toplam>50 || toplam<10 ){
           System.out.println("Degerleri yanlis girdiniz");
       }

       else if (toplam>=30) {
            System.out.println("Obezsiniz ");

        } else if (toplam>=25) {
            System.out.println("Kilolusunuz");
        } else if (toplam>=20){
            System.out.println("Kilonuz normal  ");
        }else {
           System.out.println("Zayıfsınız ");
       }


    }
}
