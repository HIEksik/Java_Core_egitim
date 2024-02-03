package day31_stringBuilder_accesModifier;

public class C04_Access_Modifire {


       private String strPrivate;
        int sayiDefault; // Görünür bir Acces modifire olmadığı için , Default Acces modifire geçerlidir
         protected boolean blProtected;


         public void methodPublic(){


        }

        /*
        Nasıl ki Class levelda oluşturulan ama deger atanmayan variable lara java default deger tanımlıyorsa

        methodlar veya class level da oluşturulan variable ler için Access modifire yazılmazsa Java default  Access modifire tanımlar

       1-  En geniş Acces modifire public==> herkes erişebilir
         2- protected ==>İçinde bulundugumuz class , package ve başka package daki child class lar.
         3- default acces modifire ==> içinde bulunduğu Class ve içinde bulunduğu Package deki diger classlar
         4- En dar acces modifire private ==> sadece içinde bulunduğu Class tan kullanılabilir.
         */

    public static void main(String[] args) {

        C04_Access_Modifire obj=new C04_Access_Modifire(); // obje oluşturduk

        System.out.println(obj.strPrivate); // static bir alan ama obje üzerinden ulaştığımız için sıkıntı yok
        System.out.println(obj.sayiDefault);
        System.out.println(obj.blProtected);
        obj.methodPublic();

        // Bir obje oluşturursak o vobje üzerinden tüm Access Modifire lara ulaşabiliriz.

    }


}
