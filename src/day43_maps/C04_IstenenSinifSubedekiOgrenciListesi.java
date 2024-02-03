package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C04_IstenenSinifSubedekiOgrenciListesi {
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

        int istenenSinif=10;
        String istenenSube="K";

        // verilen sınıf ve şubedeki ögrencilerin  isim ve soy isimlerini yazdırın
        Set<Integer> keySet=ogrenciMap.keySet();

        for (Integer eachKey:keySet
        ) {
            // 3- For EachLoop un getirdigi key e ait value yu kaydedelim
            String valueEach=ogrenciMap.get(eachKey); // Esra-Han-11-M-SOZ
            // 4- İstenen bilgiye ulaşmak için Split yapıp Array e kaydedelim
            String[] valueEachArr=valueEach.split("-");// [Esra,Han,11,M,SOZ)
            // 5- istenen bilgiyi yazdıralım
            if (Integer.parseInt(valueEachArr[2])==istenenSinif && valueEachArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(valueEachArr[0]+" "+valueEachArr[1]);
            }

    }
}
}
