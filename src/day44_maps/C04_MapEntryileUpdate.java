package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C04_MapEntryileUpdate {
    public static void main(String[] args) {

        // Ogrenci map inde verilen sınıfdaki (Ornegin 10) herkesin sınıfını
        // verilen yeni sınıf (ornegin 11 ) yapin


        String eskiSinif="10";
        String yeniSinif="11";

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

       Set<Map.Entry<Integer,String>> ogrenciEntryseti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntryseti
             ) {

            String[] eachvalueArr=eachEntry.getValue().split("-");

            if (eachvalueArr[2].equals(eskiSinif)){
                eachvalueArr[2]=yeniSinif;
            }
            // entrySet inde yapilan value  ataması otomatik olarak map e de işleniyor
            eachEntry.setValue(eachvalueArr[0]+"-"+eachvalueArr[1]+"-"+eachvalueArr[2]+"-"+eachvalueArr[3]+"-"+eachvalueArr[4]);
        }

        System.out.println(ogrenciMap);


    }
}
