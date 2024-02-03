package day19_arrays;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {


        int [] sayilar={3,-2,-5,6,-6,8};

        String [] isimler={"ali","halil","halil","mehmet"};

        // Syilar arrayindeki tüm sayilari 3 arttırıp , kaydedin

        sayilar= C02_ArrayinElemanlariniArttirma.arrayelemanlariarttirma(sayilar,3);

        System.out.println(Arrays.toString(sayilar));// [6, 1, -2, 9, -3, 11]

        // sayılar arrayinin yeni halinde pozitif elementlerinin toplamini yazdırın

        System.out.println("Pozitif elementlerin toplami "+C03_PozitifSayilariToplama.pozitifElementleriTopla(sayilar));// 27


        // isimler arrayınde halil ismi  kaç kere kullanılmış

        C04_KullanimadediniBulma.elemanAramah(isimler,"halil");



    }
}
