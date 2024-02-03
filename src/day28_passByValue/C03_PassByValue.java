package day28_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        // Verilen fiyat üzerinden %10 indirimli fiyat hesaplayip,
        // indirimli fiyati yazdıran bir method olusturun

        double fiyat=200;
        yude10indirimliFiyatYazdir(fiyat);


    }
    public static void yude10indirimliFiyatYazdir(double fiyat){

        fiyat=fiyat*90/100;
        System.out.println("İndirimli fiyat : " +fiyat);
    }

}
