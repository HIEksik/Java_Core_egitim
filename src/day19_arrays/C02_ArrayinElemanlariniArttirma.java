package day19_arrays;

import java.util.Arrays;

public class C02_ArrayinElemanlariniArttirma {
    public static void main(String[] args) {
        //Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int [] arr={5,3,6,5,2,3,};

        // eger array in tüm elementlerini gözden geçirmemiz gerekiyorsa
        // bir foor loop kulllaniriz

        for (int i = 0; i < arr.length; i++) {

            arr[i]=arr[i]+2; // eski degerinin 2 fazlası


        }

        System.out.println(Arrays.toString(arr)); // [7, 5, 8, 7, 4, 5]


        arr=arrayelemanlariarttirma(arr,3);

        System.out.println(Arrays.toString(arr)); // [10, 8, 11, 10, 7, 8]



    }

    public static int [] arrayelemanlariarttirma(int[] arr, int artismiktari){

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]+artismiktari;
        }
     return arr;
    }


}
