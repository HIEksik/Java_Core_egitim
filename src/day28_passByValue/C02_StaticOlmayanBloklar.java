package day28_passByValue;

public class C02_StaticOlmayanBloklar {

    C02_StaticOlmayanBloklar(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");

        C02_StaticOlmayanBloklar obj1=new C02_StaticOlmayanBloklar();
        C02_StaticOlmayanBloklar obj2=new C02_StaticOlmayanBloklar();


    }

    // static olmayan blok {} parantezlere ile oluşturulur

    {
        // static olmayan bloklar obje oluşturulacağı zaman constructor dan hemen önce calisir.
        // mainde obje oluşturmasaydık sadece main çalışacaktı
        // obje oluşturdugumuz için
        // önce main sonra static olamayn sonra constructor çalıştı
        // oluşturulan her objede bir , obje çalışmadan önce static olmayan çalışır

        // bu da bir obje oluşturulmadan önce yapılması gereken ön ayarlar varsa kullanılır
        System.out.println( "Static olmayan blok calisti");
    }


}
