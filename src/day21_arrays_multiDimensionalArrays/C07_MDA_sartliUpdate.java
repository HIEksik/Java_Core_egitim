package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C07_MDA_sartliUpdate {
    public static void main(String[] args) {

        // Verilen iki katli bir array de
        // Pozitif sayilarin degrini 3 azaltıp
        // negatif sayilarin degerini 4 arttırın

        int[][] arr={{3,6,-5,},{-4,-9,},{-5,2,},{3,-6,4,}};


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>0){
                    arr[i][j]-=3;

                }if (arr[i][j]<0){
                    arr[i][j]+=4;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
