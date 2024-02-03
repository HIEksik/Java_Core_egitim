package day44_maps;

import java.util.HashMap;
import java.util.Map;

public class C06_NestedMap {
    public static void main(String[] args) {

        //        ogrenciMap.put(101,"isim = ali- soyisim = Can- sinif = 11- sube =H- bolum=MF");
        //        ogrenciMap.put(102,"VELI-Cem-10-K-TM");
        //        ogrenciMap.put(103,"ALi-Cem-11-K-TM");


        Map<String,String > ogrenci101valueMap=new HashMap<>();
        ogrenci101valueMap.put("Isım","Ali");
        ogrenci101valueMap.put("Soyisim","Can");
        ogrenci101valueMap.put("Sinif","11");
        ogrenci101valueMap.put("Sube","H");
        ogrenci101valueMap.put("Bolum","MF");

        Map<String,String > ogrenci102valueMap=new HashMap<>();
        ogrenci102valueMap.put("Isım","Vali");
        ogrenci102valueMap.put("Soyisim","Cem");
        ogrenci102valueMap.put("Sinif","10");
        ogrenci102valueMap.put("Sube","K");
        ogrenci102valueMap.put("Bolum","TM");

        Map<String,String > ogrenci103valueMap=new HashMap<>();
        ogrenci103valueMap.put("Isım","Ali");
        ogrenci103valueMap.put("Soyisim","Cem");
        ogrenci103valueMap.put("Sinif","11");
        ogrenci103valueMap.put("Sube","K");
        ogrenci103valueMap.put("Bolum","TM");

        Map<Integer,Map<String,String>> ogrenciMap=new HashMap<>();

        ogrenciMap.put(101,ogrenci101valueMap);
        ogrenciMap.put(102,ogrenci102valueMap);
        ogrenciMap.put(103,ogrenci103valueMap);

        System.out.println(ogrenciMap);
        /*
        {101={Bolum=MF, Soyisim=Can, Sube=H, Isım=Ali, Sinif=11},
        102={Bolum=TM, Soyisim=Cem, Sube=K, Isım=Vali, Sinif=10},
        103={Bolum=TM, Soyisim=Cem, Sube=K, Isım=Ali, Sinif=11}}

         */
        // 102, Numaralı öğrencimnin soyadını yazdırın

        System.out.println(    ogrenciMap.get(102).get("Soyisim")   );// Cem

        // 103 numaralı ogrencinin sınıfını 12 yapın

        ogrenciMap.get(103).put("Sinif","12");
        System.out.println(ogrenciMap);

        // 102 numaralı oğrencinin bolumunu yazdırın

        System.out.println(ogrenciMap.get(102).get("Bolum")); // TM

        // 102 numaralı öğreninin bolumunu Mf yapın

        ogrenciMap.get(102).put("Bolum","MF");
        System.out.println(ogrenciMap);




    }
}
