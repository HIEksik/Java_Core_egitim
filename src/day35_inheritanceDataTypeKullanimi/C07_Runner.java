package day35_inheritanceDataTypeKullanimi;

public class C07_Runner {

    /*
    Eger özellikler method olarak oluşturuldu ise
    Obje ninm taşıdıgı özellikleri belirlemek için
    Data türünün yanında Constructor da etkili olur


    Bir objenin istenen özelligi taşıyıp taşımadıgını
    Data türü belirler

    O özelligin daha güncel degerinin olup olmadığı ise Constructor a bağlıdır .

     Obje nin özelligi bulunduktan sonra Constructorın oldugu Class a kadar daha güncel bilgi olup olmadığını
     kontrol eder , ve daha güncel bilgi bulursa onu kullanır
     */


    public static void main(String[] args) {


        C06_AvciKuslar avciKus1 = new C06_AvciKuslar();

        /*
        Avcı kuşlar Class ından başlar aramaya
        en güncel olana kardar arara ve bilgiyi getirir
         */


        avciKus1.omur();// yasar ve olur H
        avciKus1.solunum();// akciger K
        avciKus1.cogalma();// yumutra K
        avciKus1.kanat();// kanatlıdır Kus
        avciKus1.hareket();// Ucarlar AVK
        avciKus1.beslenme();// et yetler Avk
        avciKus1.gaga();// Sivri gagalidir AVK
        avciKus1.pence();// penceleri vardir AVK


        C05_Kuslar avciKus2 = new C06_AvciKuslar();
        /*
        Kuşlar clasından başlar aramaya , yukarı doğru arar , variable yi bulursa güncel bilgi için aşşagıya iner
        ve getirir , Bulamazsa CTE verir . Çünkü aramak için aşşagı claslara inmez
        sadece yukarda bulursa güncel bilgi için aşşagı iner
         */


        avciKus2.omur();// yasar ve olur H
        avciKus2.solunum();// akciger K
        avciKus2.cogalma();// yumutra K
        avciKus2.kanat();// kanatlıdır Kus
        avciKus2.hareket();// Ucarlar AVK
        avciKus2.beslenme();// et yetler Avk
        avciKus2.gaga();// Sivri gagalidir AVK
       //  avciKus2.pence();// CTE

        C04_Hayvanlar avciKus3 = new C06_AvciKuslar();


        avciKus3.omur();// yasar ve olur H
        avciKus3.solunum();// akciger K
        avciKus3.cogalma();// yumutra K
      //  avciKus3.kanat();// CTE
        avciKus3.hareket();// Ucarlar AVK
        avciKus3.beslenme();// et yetler Avk
       // avciKus3.gaga();// CTE
       // avciKus3.pence();// penceleri vardir AVK

        C05_Kuslar Kus1 = new C05_Kuslar();

        /*
        Obje clası ve Constructor Aynı olursa hiç bir şekilde aşşagıya inmez kendinden sonraki  claslara bakmaz
        Sadece yukarıdaki kendinden önceki Claslara bakar bilgiyi getirir

        Constructor a göre arama yapmaya başlarız.

        Burada hem data türü yani Class hemde Constructor önemli
         */

        Kus1.omur();// yasar ve olur H
        Kus1.solunum();// akciger K
        Kus1.cogalma();// yumutra K
        Kus1.kanat();// kanatlıdır Kus
        Kus1.hareket();// Ucarlar AVK
        Kus1.beslenme();// et yetler Avk
        Kus1.gaga();// Sivri gagalidir AVK
       //  Kus1.pence();// CTE



    }
}
