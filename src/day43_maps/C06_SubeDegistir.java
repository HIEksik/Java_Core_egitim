package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C06_SubeDegistir {
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

        // Eski sube olarak verilen sube deki tüm ögrencilerin subelerini
        // yeni sube olarak verilen sube yapın

        String eskiSube="K";
        String yeniSube="Z";

        Set<Integer> ogrenciKeyset=ogrenciMap.keySet();

        for (Integer each: ogrenciKeyset
             ) {
            String eachValu=ogrenciMap.get(each);
            String[] eachvaluArr=eachValu.split("-");
            if (eachvaluArr[3].equalsIgnoreCase(eskiSube)){
                eachvaluArr[3]=yeniSube;
            }

            // düzeltilmesi gereken bilgi düzeltildi
            // bu bilgilerle map i güncelleyelim

            String yenivalue=eachvaluArr[0]+"-"+eachvaluArr[1]+"-"+eachvaluArr[2]+"-"+eachvaluArr[3]+"-"+eachvaluArr[4];

            ogrenciMap.put(each,yenivalue);
        }

        System.out.println(ogrenciMap);



    }
}
