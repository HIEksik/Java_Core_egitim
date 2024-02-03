package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C06_MDA_TumElementleriArttirma {
    public static void main(String[] args) {

        // Verilen iki katlı bir int arraydeki tüm sayılari 3 arttırın?

        int[][] arr={{3,6,5,},{4,9,},{5,2,},{3,6,4,}};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j]+=3;

            }
        }
        System.out.println(Arrays.deepToString(arr)); // [[6, 9, 8], [7, 12], [8, 5], [6, 9, 7]]
    }
}
