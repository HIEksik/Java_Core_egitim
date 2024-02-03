package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_MapdekiIsimleriDuzenleme {
    public static void main(String[] args) {

         // Ogrenci map indeki tüm isimleri ilk harf büyük sonraki harfler küçük
        // tüm soy isimleri ile tamamen buyuk harf yapın

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

        // Update isteniyor
        // 1- Tüm keyleri alalım
        // 2- bir for-each loop ile key setindeki tüm key lere ait valuleri gözden geçirelim
        // 3- value leri String olarak kaydedelim
        // 4- Stringdeki value leri split ile valuyu array e çevirelim
        // 5- Array i yeniden String value formatına sokalım
        // 6- key ile yeni update value yu kullanarak map i update edelim

        Set<Integer> keySet= ogrenciMap.keySet();

        for (Integer eachKey:keySet
             ) {
            String eachValue = ogrenciMap.get(eachKey);
            String[] eachValueArr=eachValue.split("-");
            eachValueArr[0]=eachValueArr[0].substring(0,1).toUpperCase()+// ilk harf büyük
                            eachValueArr[0].substring(1).toLowerCase(); // gerisi küçük
            eachValueArr[1]=eachValueArr[1].toUpperCase();// tüm harfler büyük oldu

            String yenivalue=eachValueArr[0]+"-"+eachValueArr[1]+"-"+eachValueArr[2]+"-"+eachValueArr[3]+"-"+eachValueArr[4];

            ogrenciMap.put(eachKey,yenivalue);
        }
        System.out.println(ogrenciMap);



    }

}
