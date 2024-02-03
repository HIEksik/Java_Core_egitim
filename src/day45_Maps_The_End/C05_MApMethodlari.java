package day45_Maps_The_End;

import java.util.HashMap;
import java.util.Map;

public class C05_MApMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> harfler=new HashMap<>();

        harfler.put("K",20);
        harfler.put("B",30);
        harfler.put("C",50);
        harfler.put("Z",80);

        System.out.println(harfler); // {B=30, C=50, Z=80, K=20}

        harfler.putIfAbsent("B",20); // eger map te yoksa B = 20 koy diyor
        System.out.println(harfler);// {B=30, C=50, Z=80, K=20}

        harfler.putIfAbsent("T",20);// olmayan harfi ve valu sunu ekledi
        System.out.println(harfler);//{B=30, C=50, T=20, Z=80, K=20}

        System.out.println(harfler.get("A"));// olmayan bir harf get ile getirilirse //null

        System.out.println(harfler.getOrDefault("B", 0)); // B yi getir Bulamazsan, degeri 0 olarak getir // 30

        System.out.println(harfler.getOrDefault("S", 0)); // S yok Default deger 0 oldugu için 0 Getirdi // eklemez

        harfler.replace("B",40);
        System.out.println(harfler);// {B=40, C=50, T=20, Z=80, K=20} B nin degerini 40 yaptı put ile aynı

        harfler.replace("M",30); // null
        System.out.println(harfler); // ekleme yapmadı öyle bir harf olmadıgı içöin

        harfler.put("M",30);
        System.out.println(harfler);// {B=40, C=50, T=20, Z=80, K=20, M=30}

        // eger replace yapılmak istenen harf map te varsa
        // replace ve put aynı işlemi görür
        // // eger replace yapılmak istenen harf map te yoksa
        // replace null döndürür ve map e eklemez
        // put ise her durumda ekler

        harfler.replace("B",40,50);// eger degeri 40 ise degerini 50 yap
        System.out.println(harfler);// {B=50, C=50, T=20, Z=80, K=20, M=30}

        harfler.replace("B",60,70);// Eski degeri 60 olmadıgı için degiştirmedi
        System.out.println(harfler);// {B=50, C=50, T=20, Z=80, K=20, M=30}






    }
}
