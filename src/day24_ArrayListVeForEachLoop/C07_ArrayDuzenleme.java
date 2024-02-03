package day24_ArrayListVeForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayDuzenleme {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        //- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //yeni bir listeye ekleyip yazdirin.

        List<String> isimler=new ArrayList<>();

        isimler.add("Halil");
        isimler.add("Mehmet");
        isimler.add("Sabri");
        isimler.add("Emel");

        List<String> yeniList=new ArrayList<>();

        for (String each:isimler
             ) {

            if (each.length()%2==0){ // kelimenin uzunlugu çift ise

                yeniList.add(each.substring(0,each.length()/2));

            }else {// kelimenin uzunlugu tek ise
                yeniList.add(each.substring(each.length()/2));
            }

        }
        System.out.println(yeniList); // [lil, Meh, bri, Em]


    }
}
