package day24_ArrayListVeForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenenHarfinOlduguIsimleriListeleme {
    public static void main(String[] args) {

        // Verilen bir String Array de
        // istenen Harfi içeren isimleri
        // Bir liste olarak yazdırın

        String[] isimler={"Portakal","Elma","Limon"+"Mandalina"};

        String istenenHarf="m";

        List<String> istenenIsimlerListesi=new ArrayList<>();

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].contains(istenenHarf)){
                istenenIsimlerListesi.add(isimler[i]);
            }
        }
        System.out.println(istenenIsimlerListesi);

    }
}
