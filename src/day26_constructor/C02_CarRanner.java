package day26_constructor;

public class C02_CarRanner {
    public static void main(String[] args) {


        C01_Car car1=new C01_Car();

        System.out.println(car1);
        // C02_Araba{marka='Marka belirtilmemis', model='Model belirtilmemis', renk='Renk belirtilmemis', yil=1900, fiyat=0}

        // Construcktor ı Direkt  yazdırdık çünkü Clasa zaten Tostring methodu tanımlanmıştı.. Atanmasaydı Tostring ile yazmamız gerekecekti
        // vergidi degerler default degerler / Varsayılan
        // şimdi atama yapıp yazdıralım

        car1.marka="Opel";
        car1.model="Vectra";
        car1.renk="Siyah";
        car1.yil=2008;
        car1.fiyat=5000;

        System.out.println(car1);
        //C02_Araba{marka='Opel',
        //          model='Vectra',
        //          renk='Siyah',
        //          yil=2008,
        //          fiyat=5000}

        C01_Car car2=new C01_Car("Toyota","Corolla");

        System.out.println(car2);
        // C02_Araba{marka='Toyota', model='Corolla', renk='Renk belirtilmemis', yil=1900, fiyat=0}

        C01_Car car3=new C01_Car("Volvo","C40");

        System.out.println(car3);
        //C02_Araba{marka='Volvo', model='C40', renk='Renk belirtilmemis', yil=1900, fiyat=0}

        // Nissan , 2012 ,Mavi bir araba oluştur

        C01_Car car4=new C01_Car("Nissan","mavi",2012);

        System.out.println(car4);
        // C02_Araba{marka='Nissan', model='Model belirtilmemis', renk='mavi', yil=2012, fiyat=0}

        C01_Car car5=new C01_Car("Tofas","Sahin","Kırmızı",2012,5000);

        System.out.println(car5);
        // C02_Araba{marka='Tofas', model='Sahin', renk='Kırmızı', yil=2012, fiyat=5000}








    }
}
