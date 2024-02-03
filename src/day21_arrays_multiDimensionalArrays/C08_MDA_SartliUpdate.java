package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C08_MDA_SartliUpdate {
    public static void main(String[] args) {

        // Verilen iki katli MDA  de
        // elementleri içinde bulunduğu inner indexi kadar arttırın

        int[][] arr={{3,6,-5,},{-4,-9,},{-5,2,},{3,-6,4,}};

        for (int i = 0; i < arr.length; i++) { // inner Arrayleri
            for (int j = 0; j < arr[i].length; j++) { // İnner arraydeki elementlerin indexini
                arr[i][j]+=j;
            }
        }

        System.out.println(Arrays.deepToString(arr)); // [[3, 7, -3], [-4, -8], [-5, 3], [3, -5, 6]]

    }
}
