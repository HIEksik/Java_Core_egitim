package day29_immutableClases;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {

    // methodlar arası veri alışverişinde eger yeni bir list veya array oluşturulursa deger ve array ve list degişir
    // sonra tekrar aynısı yazılır


    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        System.out.println(elemanEkle(sayilar));
        System.out.println(sayilar);
        System.out.println(yeniList(sayilar));
        System.out.println(sayilar);
    }
    public static List<Integer> yeniList(List<Integer> sayilar){
        sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(60);
        sayilar.add(70);

        return sayilar;
    }
    public static List<Integer> elemanEkle(List<Integer> sayilar){
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        System.out.println(sayilar);

        return sayilar;
    }



}
