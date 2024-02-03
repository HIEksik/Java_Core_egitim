package day25_constructors;

public class C03_Ranner {

    public static void main(String[] args) {

        /*
        Javada herhangi bir Classten obje olusturdugumuzda Java ilk olarak o objeyi olusturur
        Oluşturuldugu Class taki tüm İnstance variable lerin birer kopyasını olulşturup objeye yapıştırır

         */



        //  Javada bir obje oluşturmak istediğimizde


        C02_Araba araba1=new C02_Araba();

        araba1.marka="Tofas";

        C02_Araba araba2=new C02_Araba();

        System.out.println(araba2.marka);// marka belirtilmemiş
        araba2.marka= "Mercedes";

        C02_Araba araba3=new C02_Araba();

        System.out.println(araba3.marka);// marka belirtilmemiş

    }

}
