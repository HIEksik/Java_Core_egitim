package day26_constructor;

public class C05_Car {

    String marka="Marka belirtilmemis";
    String model= "Model belirtilmemis";
    String renk="Renk belirtilmemis";
    int yil= 1900;
    int fiyat;

    C05_Car(){

    }

    // Marka ve model parametreli bir constructor oluşturalım
    C05_Car(String mrk,String mdl){
        marka=mrk;
        model=mdl;

    }

    // Tüm variablelerin olduğu bir constructor oluşturun

    C05_Car(String marka,String model,String renk,int yil, int fiyat){
        /*
        Constructor içinde atama yapmanın amacı
        parametre olarak gelen degeri
        Class laveldaki instance variable a atamaktır

        Class level deki variable ve Constructor daki parametre variablesi farklı olmalı isimler aynı olamaz

        Eger Class laveldeki variable isimleri ,le parametredeki variable isimleri aynı olacaksa
        Java ya Hangi variablenin Class level daki instance variable olfugunu BELİRTMEMİZ lazım

        Java bu ihtiyaç için bize this.keyword unu vermiştir.

        Variablenin önüne this. keyword unu yazarız onun class level instance variablesi oldugunu gösterirriz.

        this. keyword u varsa bir variablenin başında java onu spoce tan degil Class level in instance variablelerinde arar

          */

        this.marka=marka;
        this.model=model;
        this.renk=renk;
        this.yil=yil;
        this.fiyat=fiyat;



    }

    @Override
    public String toString() {
        return "C05_Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
