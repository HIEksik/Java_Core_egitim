package day43_maps;

import java.util.HashMap;
import java.util.Map;

public class C05_IstenenOgrencininSoyIsminiUpdateEtme {
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

        // 110 numaralı öğrencinin soy ismini mismis yapin ?

        ogrenciMap.put(103,"Ali-Han-12-M-MF");
        // eger bir map e yeni bir value eklersek o eski value yiş siler yenisini ekler

        System.out.println(ogrenciMap.get(103));//Ali-Han-12-M-MF

        // Update işlemlerini dinamik olarak yapabilmek için
        // önce degiştirmek istedigimiz bilgiye ulaşmalıyız
        // bunu önceki sorularda yaptıgımız gibi
        // önce value ye ulaşıp value yi split edip istedigimiz bilgiye ulaşabiliriz

        // 1- istenen ögrencinin value sine ulaşıp kaydederiz

        String value110=ogrenciMap.get(110);// "Azim-Kayisi-11-K-TM"

        // 2- Value 110 da istedigimiz bilgiye ulaşabilmek için split yapıp kaydedin

        String [] value110Arr=value110.split("-"); // "[Azim,Kayisi,11,K,TM]"

        // 3- istenen degişikligi arr de yapın

        value110Arr[1]="Mismis";// [Azim,Mismis,11,K,TM]

        // istenen degişikligi array de yaptıktan sonra , map i guncelliye bilmek için
        // array i yeniden string value formuna dönüştürmeliyiz "Azim-Mismis-11-K-TM"

        // 4- degişen array i yeniden value formatına getir


        String yeniValue=value110Arr[0]+"-"+value110Arr[1]+"-"+value110Arr[2]+"-"+value110Arr[3]+"-"+value110Arr[4];

        // 5- map i guncelle

        ogrenciMap.put(110,yeniValue); // 110=Azim-Mismis-11-K-TM}

        System.out.println(ogrenciMap);












    }
}
