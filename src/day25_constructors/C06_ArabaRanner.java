package day25_constructors;

public class C06_ArabaRanner {
    public static void main(String[] args) {

        C02_Araba araba;
        // Constructor kullanılmadığından obje oluşturulacagı söylenmiş
        // ama obje oluşturulup ilk deger ataması yapılmamıştır

       // System.out.println(araba.fiyat);// arabaya deger atanmamış / hata verir

        C02_Araba araba1=new C02_Araba();
        // Eger Constructor bodysinde bir atama yoksa
        // veya default constructor kullanılmişsa
        // olusturulan obje oluşturuldugu Clasta ilk atanmış olan degerlere sahip olur

        System.out.println(araba1);
        //C02_Araba{marka='Marka belirtilmemis', model='Model belirtilmemis', renk='Renk belirtilmemis', yil=1900, fiyat=0}
        // Clasta toString methodu varsa özellikleri yazdırır

        // 2000 model yeşil fiyatı 3000 olan bir opel  corsa oluşturun
        // önce bir obje oluşturup sonra istenen degerlerin atamasını yapabiliriz

        C02_Araba araba2=new C02_Araba();

        araba2.marka="Opel";
        araba2.model="Corsa";
        araba2.yil=2000;
        araba2.renk="Yeşil";
        araba2.fiyat=3000;

        System.out.println(araba2);// C02_Araba{marka='Opel', model='Corsa', renk='Yeşil', yil=2000, fiyat=3000}




    }
}
