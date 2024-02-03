package day45_Maps_The_End;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class C06_TreeMap {
    public static void main(String[] args) {

        //Map<String,Integer> harfler=new TreeMap<>();
        TreeMap<String,Integer> harfler=new TreeMap<>();

        harfler.put("K",20);
        harfler.put("B",30);
        harfler.put("C",50);
        harfler.put("Z",80);
        harfler.put("A",20);
        harfler.put("E",30);
        harfler.put("U",50);

        System.out.println(harfler);//{A=20, B=30, C=50, E=30, K=20, U=50, Z=80}

        // Eger Data türü olarak map seçilirse
        // diger tüm MAp ler le HasMap vs. ile ortak olan özellikleri gösterir

        System.out.println(harfler.lowerKey("K")); // E < K dan küçük olan key i ver

        System.out.println(harfler.lowerKey("T"));//  K <

        System.out.println(harfler.floorKey("E"));// E  <= Aşşagı yuvarlamak e varmı var ozaman e yi verir

        System.out.println(harfler.floorKey("D"));// C  <=

        System.out.println(harfler.higherKey("F"));// K > büyüktür gibi f den sonra ne var k
        System.out.println(harfler.higherKey("U"));// Z >
        System.out.println(harfler.ceilingKey("C"));//C >= C den büyük ne var C var
        System.out.println(harfler.ceilingKey("D"));//E >= D yok Sonraki büyük olan E var

        System.out.println(harfler.descendingMap());// {Z=80, U=50, K=20, E=30, C=50, B=30, A=20} Büyükten küçüge sıralar

        // TreeMap her zaman doğal sıralı elemanlarını tutar
        // ters sıralı olan bir mar, Tree map olarak kaydedilemez

        // Data türü Tree map seçilince,
        // tum MAplere ait methodlar geldigi gibi
        // sadece Tree map e ait methodlar da gelir.

        harfler.put("M",34); // Yeni eleman eklersek önce m nin nere olması gerektirğimnmi hesaplar sonra put işlemini yapar
        System.out.println(harfler);// {A=20, B=30, C=50, E=30, K=20, M=34, U=50, Z=80}

        System.out.println(harfler.subMap("C", "M")); // {C=50, E=30, K=20} başlangıçlar dahil bitişler degil

        System.out.println(harfler.tailMap("K")); // k dan başlayıp kuyrugu yazdırır  k dahil // {K=20, M=34, U=50, Z=80}

        System.out.println(harfler.headMap("M")); // {A=20, B=30, C=50, E=30, K=20} // M yi hariç yazdırdı

        System.out.println(harfler.tailMap("K", false));// {M=34, U=50, Z=80} K yı dahil etmedik

        System.out.println(harfler.headMap("M",true));// {A=20, B=30, C=50, E=30, K=20, M=34} M dahil tüm harfleri verir




    }
}
