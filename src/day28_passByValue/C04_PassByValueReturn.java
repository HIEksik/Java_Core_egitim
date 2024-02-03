package day28_passByValue;

public class C04_PassByValueReturn {

    public static void main(String[] args) {

        /*
        Methodlar arası geçişte veriable nin kendisi degi,l degeri yollanır..

        Her methodunn içindeki local variable o methodda geçerçli olduğundan main methodda atama varsa
        main method daki fiyat variablesi kalıcı degişir
       Diger methodda atama varsa o methoddaki variablenin degeri degişir

       Method her çağırıldıgında sanki ilk defa çalışıyormuş gibi sıfırdan başlar.
         */
        // verilen bir fiyat için
        //%10 indirimli fiyatı hesaplayip
        // indirimli fiyatı döndüren
        // bir method olusturun

        double fiyat=200;
        System.out.println(fiyat);// 200
        System.out.println(yuzde10indirimliFiyatHesapla(fiyat));// 180



    }
    public static double yuzde10indirimliFiyatHesapla(double fiyat){
        fiyat=fiyat*90/100;

        return fiyat;
    }
}
