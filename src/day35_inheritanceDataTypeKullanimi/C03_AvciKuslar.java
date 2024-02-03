package day35_inheritanceDataTypeKullanimi;

public class C03_AvciKuslar extends C02_Kuslar{

    String hareket="Ucarlar";
    String beslenme="et yerler";
    String pence="pencelidir";
    String gaga="Sivri gagali";

    public static void main(String[] args) {

        /*
        Eger ozellikler variable olarak oluşturulursa
        Güncel bilgiye bakılmaz
        Obje hangi data türünü kullanmışsa
        o class taki diger objelerle aynı özelligi taşır

        _ Bir objenin hangi degerleri alacağını bulmak için
        Objenin data türü olan Class tan aramaya başlarız ve ilk buldugumuz
        degeri kullanırız.

        Aradığımız variable yi bulamazsak CTE verir.

        NOT : Eger özellikler variable olarak oluştutulduysa
        Constructor in variable ların üzerinde hiç bir etkisi olmuyor
        Tum degerler data type i olan class a göre belirleniyor.

         */


        C03_AvciKuslar avciKus1=new C03_AvciKuslar();


        System.out.println(avciKus1.omur);// yasar ve olur H
        System.out.println(avciKus1.cogalma);// yumutlayla K
        System.out.println(avciKus1.kanat);// kanatlıdır K
        System.out.println(avciKus1.solunum);// akciger Kus
        System.out.println(avciKus1.hareket);// Ucarlar AVK
        System.out.println(avciKus1.beslenme);// et yetler Avk
        System.out.println(avciKus1.gaga);// Sivri gagalidir AVK
        System.out.println(avciKus1.pence);// penceleri vardir AVK

        C02_Kuslar avciKus2=new C03_AvciKuslar();

        /*
        Aramaya Kuşlar clasından başladı ve tek tek aradı pence kuşlar ve hayvanlar clasında olmadığı için CTE verdi
         */
        System.out.println(avciKus2.omur);// yasar ve olur H
        System.out.println(avciKus2.cogalma);// yumutlayla K
        System.out.println(avciKus2.kanat);// kanatlıdır K
        System.out.println(avciKus2.solunum);// akciger Kus
        System.out.println(avciKus2.hareket);// Ucarlar H
        System.out.println(avciKus2.beslenme);// et yetler H
        System.out.println(avciKus2.gaga);//  gagalidir K
        // System.out.println(avciKus2.pence);// CTE


         C01_Hayvanlar avciKus3=new C03_AvciKuslar();

         /*
         Aramaya Hayvanlar Clasından başlayacak
          */


        System.out.println(avciKus3.omur);// yasar ve olur H
        System.out.println(avciKus3.cogalma);// cogalırlar H
        // System.out.println(avciKus3.kanat);// CTE
        System.out.println(avciKus3.solunum);// nefes alır  H
        System.out.println(avciKus3.hareket);// haraketederler H
        System.out.println(avciKus3.beslenme);//beslenirler H
       // System.out.println(avciKus3.gaga);//  CTE
        // System.out.println(avciKus3.pence);// CTE


        System.out.println("==================================");

        C02_Kuslar kus1=new C02_Kuslar();

        System.out.println(kus1.omur);// yasar ve olur H
        System.out.println(kus1.cogalma);// yumutlayla K
        System.out.println(kus1.kanat);// kanatlıdır K
        System.out.println(kus1.hareket);// Ucarlar H
        System.out.println(kus1.beslenme);// et yetler H
        System.out.println(kus1.gaga);//  gagalidir K
        System.out.println(kus1.solunum);// akciger Kus
        // System.out.println(kus1.pence);// CTE




    }
}
