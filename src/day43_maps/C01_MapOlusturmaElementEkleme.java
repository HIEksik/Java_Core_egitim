package day43_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01_MapOlusturmaElementEkleme {
    public static void main(String[] args) {
        /*
        Bir öğrenciyi map e eklemek için put(key,value) kullanırız

        bir öğrencinin value suna ulaşmak için
        - ogrenciMAp.get(ogrenciNo) ile String olarak tum value yi alıp kaydederiz
        - value , pekçok bilgi barındırdıgından her bir bilgiye ulaşmak için
          value.split("-") ile Array e çeviririz
        - Array deki tüm bilgilerin index lerine sahip oldugumuzdan
          istenen bilgileri Arrayden alıp yazdırabilir veya kullana biliriz

         */

        Map<Integer,String> ogrenciMap=new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-10-K-MF");
        // bu ögrenci için key = 101
        //                 value = "Ali-Can-10-K-MF"
        // value String olmak zorunda degil List,Array,Integer,Map,Queue herşey olabilir

        System.out.println(ogrenciMap.get(101));// Ali-Can-10-K-MF

        String value101=ogrenciMap.get(101);

        System.out.println(value101);// Ali-Can-10-K-MF

        // 101 numaralı oörencinin soy ismini yazdırın ?

       String [] ogrenci101BilgileriArr=value101.split("-"); // önce value yi Bir Array e gönderdik

        System.out.println(Arrays.toString(ogrenci101BilgileriArr));// [Ali, Can, 10, K, MF]

        System.out.println("101 numarali öğrencinin soyismi : "+ogrenci101BilgileriArr[1]);// Can

        // 101 numaralı öğrencinin bölümünü yazdırın ?

        System.out.println("101 numarali öğrencinin soyismi : "+ogrenci101BilgileriArr[4]);//  MF

        // 101 numaralı öğrencinin ismi ve soyismini yazdırın, Soy isim büyük harfle yazdırın ?

        System.out.println("101 numarali öğrencinin isim ve soyismi : "+ogrenci101BilgileriArr[0]+" "+
                ogrenci101BilgileriArr[1].toUpperCase() );// Ali CAN





    }
}
