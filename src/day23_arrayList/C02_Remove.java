package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        String[] harfler={"j", "a", "v", "l", "b", "b","a"};

        // bunu liste aktaralım
        List<String> harflistesi=new ArrayList<>();

        for (int i=0;i<harfler.length;i++){

            harflistesi.add(harfler[i]);
        }
        System.out.println(harflistesi); // [j, a, v, l, b, b, a]

        // Harflerlistesinden "a" yı silin

        // indexini bilmedigimiz için "a" yı yazacagız ilk ayı silecek
        System.out.println(harflistesi.remove("a"));// true

        System.out.println(harflistesi);// [j, v, l, b, b, a]

        /*
        Eger parametre olarak bir obje yazarsak gidip o objenin ilk elementini siler. ve True veya false döndürür
         */

        System.out.println(harflistesi.remove("x")); // false  // listede x yok

        System.out.println(harflistesi); // [j, v, l, b, b, a] // listemiz aynı kaldı

        // peki index yazarsak

        System.out.println(harflistesi.remove(2));//  l  // index teki elementi direk siler // harfi gösterir
        // olmayan index yazarsak hata verir

        System.out.println(harflistesi);// [j, v, b, b, a]

        List<String> silinenHarfler=new ArrayList<>();

        System.out.println(silinenHarfler.add(harflistesi.remove(1))); // true

        System.out.println(harflistesi); // [j, b, b, a]
        System.out.println(silinenHarfler); // [v]

        // 1 - Silinen harflere yeni bir element ekledi ve True döndürdü
        // 2 - Silinen harflare harflistesinden sildigi ilk indexi silinen harflare aldı.


    }
}
