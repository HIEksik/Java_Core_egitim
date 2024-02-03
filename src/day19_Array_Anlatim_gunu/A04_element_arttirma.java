package day19_Array_Anlatim_gunu;

import java.util.Arrays;

public class A04_element_arttirma {
    public static void main(String[] args) {

        //  Aşşagıdaki ürünlerin fiyatını 3 tl arrtırın

        int [] sayilar={4,4,3};

        for (int i = 0; i <sayilar.length ; i++) {
            sayilar[i]+=3;
        }
        System.out.println(Arrays.toString(sayilar));// [7, 7, 6]




    }

}
