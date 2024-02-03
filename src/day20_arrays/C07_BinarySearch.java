package day20_arrays;

import day19_arrays.C04_KullanimadediniBulma;

import java.util.Arrays;

public class C07_BinarySearch {
    public static void main(String[] args) {
         String [] harfler={"a","g","b","d","p","d","a"};

        // verilen harfler array inde p harfinin olup olmadığını yazdırın

        C04_KullanimadediniBulma.elemanAramah(harfler,"p"); // verilen p metni array de 1 kere kullanılmiş

        // "A" var mı

        C04_KullanimadediniBulma.elemanAramah(harfler,"A"); // verilen A metni array de yok

        int [] arr={3,9,1,17,5,2,20};
        // verilen arr de 2 var mı

        System.out.println(Arrays.binarySearch(arr, 2)); // -1
        System.out.println(Arrays.binarySearch(arr, 20));// 6
        System.out.println(Arrays.binarySearch(arr, 1));// -1
        System.out.println(Arrays.binarySearch(arr, 17));// 3
        System.out.println(Arrays.binarySearch(arr, 3));// 0
        System.out.println(Arrays.binarySearch(arr, 5));// -2

        // BinarrySearch , binaryTree özelligini kullandığından
        //arama işleminden önce sort işlemi yapılmalıdır
        // sort işlemi yapılmadan binarySearh işlemi yapılırsa
        // sonuç ön görülemez doğru veya yanlış verir

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5, 9, 17, 20]

        System.out.println(Arrays.binarySearch(arr, 2)); // -1 //  1
        System.out.println(Arrays.binarySearch(arr, 20));// 6 // 6
        System.out.println(Arrays.binarySearch(arr, 1));// -1 // 0
        System.out.println(Arrays.binarySearch(arr, 17));// 3 // 5
        System.out.println(Arrays.binarySearch(arr, 3));// 0 // 2

        // olan elemanların index ini bulunduğu yeri doğru verdi

        // olmayanı aratalım

        // olmayan sayıları belirtmek için - kullanır

        System.out.println(Arrays.binarySearch(arr,0)); // -1
        System.out.println(Arrays.binarySearch(arr,4)); // -4
        System.out.println(Arrays.binarySearch(arr,50)); // -8

        // olmayan elementlerin yerlerini sıra olarak verir - kullanır
        // index olarak degil sıra olarak verir




    }
}
