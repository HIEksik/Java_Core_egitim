package day25_constructors;

public class C05_DefaultContructor {
    public static void main(String[] args) {

        /*
        Java bir Class oluşturuldugunda
        OOP kullanılarak bu clastan obje olusturula bilmesi için
        Class a default bir constructor koyar

        Default Constructor görünmez ve bodysinde kod yoktur.


         */


        C02_Araba araba=new C02_Araba();

        // Arabanın özelliklerini yazdırın

        System.out.println("Marka : "+araba.marka+" Model : "+araba.model+" Renk : "+araba.renk+" Yıl : "+araba.yil+" Fiyat : "+araba.fiyat);
        //Marka : Marka belirtilmemis Model : Model belirtilmemis Renk : Renk belirtilmemis Yıl : 1900 Fiyat : 0

        araba.marka="Bmw";
        araba.model="5.20";
        araba.renk="Kırmızı";
        araba.yil=2010;
        araba.fiyat=1500;

        // Arabanın özelliklerini yazdırın

        System.out.println("Marka : "+araba.marka+" Model : "+araba.model+" Renk : "+araba.renk+" Yıl : "+araba.yil+" Fiyat : "+araba.fiyat);
        // Marka : Bmw Model : 5.20 Renk : Kırmızı Yıl : 2010 Fiyat : 1500

        System.out.println(araba);
        // C02_Araba{marka='Bmw', model='5.20', renk='Kırmızı', yil=2010, fiyat=1500}


    }
}
