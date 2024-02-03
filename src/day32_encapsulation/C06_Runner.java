package day32_encapsulation;

public class C06_Runner {
    public static void main(String[] args) {

        /*
        Bir variableyi Hem getter hemde setter methodu oluşturursak public gibi yapmış oluruz
        Setter  atama yapma
        Getter okuma write bilgiyi yazdırma
         */

        C05_Encaptulation obj=new C05_Encaptulation();

        // ismer deger atayalim

        obj.setIsim("Halil");
        // isim variablesinin degerini yazdıralım

        System.out.println(obj.getIsim()); // Halil

        // soyisim e deger atayalım

        obj.soyIsim="Eksik";

        // soyisim variable sinin degerini yazdıralım

        System.out.println(obj.soyIsim); //Eksik


    }
}
