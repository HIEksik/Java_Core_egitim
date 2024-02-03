package day44_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C05_FarkliDataTurlerindekiElementleriKullanma {
    public static void main(String[] args) {

        List<String> things=new ArrayList<>();

        things.add("Gul");
       // things.add(10);
        //things.add(false);
       // things.add('k');

        int [] arr={4,5,6};

        //things.add(arr);

        // ben farklı data türündeki her türlü bilgiyi bir listeye eklemek istersem

        List<Object> seyler=new ArrayList<>();

        seyler.add(10);
        seyler.add(false);
        seyler.add('k');
        seyler.add(arr);
        seyler.add("Halil");

        System.out.println(seyler);// [10, false, k, [I@1d251891, Halil]

        // 1.indexte bukunan sayının 2 katını yazdırın.

        System.out.println((Integer) seyler.get(0)*2); // 20

        // 4 üncü indexteki ismi büyük harflerle yazdırın

        System.out.println(((String) seyler.get(4)).toUpperCase()); // HALIL

        // 3 üncü index teki array i yazdırın

        System.out.println(Arrays.toString((int[])seyler.get(3))); // [4, 5, 6]

    }
}
