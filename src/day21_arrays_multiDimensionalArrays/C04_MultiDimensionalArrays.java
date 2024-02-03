package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int [][] arr ={{3,4,5},{9,10},{7},{1,2,3,4,5,6}};


        // array in iç elementleri ni yazdırmak istersek

        System.out.println(arr[2][0]);// 7
        System.out.println(arr[0][0]);// 3
        System.out.println(arr[1][0]);// 9
        System.out.println(arr[3][2]);// 3
        System.out.println(arr[3][5]);// 6

        // veya dış array istersek

        System.out.println(Arrays.toString(arr[1]));// [9, 10]

        // hepsini yazacaksak

        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [9, 10], [7], [1, 2, 3, 4, 5, 6]]


        // 10 elementin yerine 5 atayın

        arr[1][1]=5;   //  atama bu şekilde yapılabnilir

        // 6 elementinin yerine deger olarak 8 atayın
        // 3. indexin adı inner arrayi (dış array ) 2. idexin adı element
        arr[3][5]=8;

        System.out.println(Arrays.deepToString(arr));// [[3, 4, 5], [9, 5], [7], [1, 2, 3, 4, 5, 8]]

        // 1. İndexteki inner elementinin degerini
        // dinamik olarak 3 arttırın

        arr[1][1]+=3;

        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [9, 8], [7], [1, 2, 3, 4, 5, 8]]




    }
}
