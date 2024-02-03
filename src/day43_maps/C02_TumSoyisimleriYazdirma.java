package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02_TumSoyisimleriYazdirma {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayşe-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
        ogrenciMap.put(108,"Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109,"Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110,"Azim-Kayisi-11-K-TM");

        // Tüm öğrencilerin   soyisimlerini yazdırın ?

     //   String value106=ogrenciMap.get(106); // String bir variable oluşturduk 106 nın value sini kaydettik
     //   String[] value106Arr=value106.split("-"); // Array oluşturup value yi arraye kaydettiik
     //   System.out.println("106 soy isim : "+value106Arr[1]); // Can

        // Tüm key leri yeni bir set objesi oluşturup içine attık
        Set<Integer>OgrenciKeySet=ogrenciMap.keySet();// [101, 102, 103, 104, 105, 106, 107, 108, 109, 110]

        for (Integer eachKey: ogrenciMap.keySet()
             ) {
            String valueEach=ogrenciMap.get(eachKey); // Sevgi-Can-10-K-MF
            String[] valueEachArr=valueEach.split("-");
            System.out.println(eachKey+ " nolu öğrencinin soyismi : "+valueEachArr[1]);
        }


    }
}
