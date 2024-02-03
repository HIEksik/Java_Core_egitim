package day26_constructor;

public class C04_ArabaRanner {
    public static void main(String[] args) {

        /*
        Kod okuma soruların da
        Olması gereken veya Kodun doğrusu böyle olmalı
        diye düşünemeyiz

        Yapmamız gereken javanın yapacağı kod takibini yapip
        kod ne işlem yapıyorsa onları anlamaktır

         */


        C03_Araba araba1 = new C03_Araba();

        System.out.println(araba1);
        // C03_Araba{marka='Toyota', model='Model belirtilmemis', renk='Renk belirtilmemis', yil=2010, fiyat=0}

        // verilen C03 araba Clası ile Aşşagıdaki araba2 objesi oluşturulursa arabanın modeli ne olur?

        C03_Araba araba2=new C03_Araba("Toyota","Corolla");

        System.out.println(araba2);
        // C03_Araba{marka='Toyota', model='A180', renk='Renk belirtilmemis', yil=2019, fiyat=0}

        // verilen C03 Araba Clası ile Aşşagıdaki araba3 objesi oluşturulursa araba3 ün marka model ve fiyatı ne olur?

        C03_Araba araba3=new C03_Araba("Nissan","Micra",5000);

        System.out.println(araba3);
        // C03_Araba{marka='Mercedes', model='Micra', renk='Yesil', yil=1900, fiyat=20000}






    }
}
