package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_IstenmeyenIsimleriSilme {
    public static void main(String[] args) {

        // Verilen String bir listede istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren
        // bir method olusturun

        List<String> isimler=new ArrayList<>();

        isimler.add("halil");
        isimler.add("ibrahim");
        isimler.add("eksik");
        isimler.add("can");
        isimler.add("emel");

        String istenmeyenHarf="a";

        System.out.println(isimler); // [halil, ibrahim, eksik, can, emel]

        List<String> yeniIsim=new ArrayList<>();

        for (int i = 0 ; i<isimler.size();i++){

            if (!isimler.get(i).contains(istenmeyenHarf)){

                yeniIsim.add(isimler.get(i));
            }

        }

        isimler=yeniIsim;
        System.out.println(isimler); // [eksik, emel]


        istenmeyenHarf="a";

        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).contains(istenmeyenHarf)){
                isimler.remove(isimler.get(i));
                i --; // isim silindigi için bir öncekinden başlaması için çünkü her silmede index kayması oluyor
            }
        }

        System.out.println(isimler); // [eksik, emel]






    }

}
