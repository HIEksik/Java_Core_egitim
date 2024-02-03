package slaytSorular_DataCasting;

import java.util.Arrays;

public class C17_Array {
    public static void main(String[] args) {

        int[] sayilar = {0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1};

        int sifirlar = 0;
        int birler = 0;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] == 0) {

                sifirlar++;
            }
        }

        System.out.println(sifirlar);// 4


        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == 1) {
                birler++;
            }
        }
        System.out.println(birler);//4

        int[] yenibirler = new int[birler];// yeni bir boş array oluşturduk

        int index1 = 0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == 1) {
                yenibirler[index1] = sayilar[i];
                index1++;
            }
        }

        int[] yeniSifirlar = new int[sifirlar];

        int index0 = 0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == 0) {
                yeniSifirlar[index0] = sayilar[i];
                index0++;
            }
        }

        System.out.println(Arrays.toString(yeniSifirlar));
        System.out.println(Arrays.toString(yenibirler));

        int[] yeniarr = new int[birler + sifirlar];

        for (int i = 0; i < yeniSifirlar.length; i++) {
            yeniarr[i] = yeniSifirlar[i];
        }

        int index2 = 0;
        for (int i = sifirlar; i < sayilar.length; i++) {
            yeniarr[i] = yenibirler[index2];
            index2++;
        }

        System.out.println(Arrays.toString(yeniarr));

    }
}
