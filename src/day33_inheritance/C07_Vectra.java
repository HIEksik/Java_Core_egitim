package day33_inheritance;

public class C07_Vectra extends C06_Opel {

    C07_Vectra(){
       super();
        System.out.println("Vectra Constructor Çalıştı");
    }
    String StrChild="Vectra class Child";

    String model="Vectra";

    public static void main(String[] args) {
        /*
        Bir class tan obje oluşturup o class ta var olan özellikleri edine bilmek için mutlaka bir Constructor çalışmalıdır.

        Extend key word kullanan bir class tan her Constructor ın ilk satırında mutlaka bir Constructor call bulunur

        Eger Görünür bir Constructor Call yoksa Java Default olarak parametresiz super() constructor call koyar..
        Yani default olarak önce perent taki parametresiz constructor ın çalışmasını ister.







         */


        C07_Vectra vectra=new C07_Vectra();

        System.out.println(vectra.strGP);// Car class.. GP
        System.out.println(vectra.strP);// Opel class .. P
        System.out.println(vectra.StrChild);// Vectra class.. Child
        System.out.println(vectra.marka);// Opel .. P class
        System.out.println(vectra.model);// Vectra .. Child class


    }


}
