package day20_arrays;

import java.util.Arrays;

public class C03_ElementleriSagaKaydirma {
    public static void main(String[] args) {
        //Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7]   array’in son hali. : [7,4,5,6]

        int [] arr={4,5,6,7,0};

        int temp=arr[arr.length-1]; // dinamik olacagı için arr nin son elemanını aldık  boş bir (temp) variablesi,ne atadık


        for (int i = arr.length-1; i >=1 ; i--) {

            arr[i]=arr[i-1];

        }

        // boş variableye aldığımız elementi en başa koyalım

        arr[0]=temp;

        System.out.println(Arrays.toString(arr));

        int [] sayilar={3,0,2,5};


        sayilar=elementSagaKaydirma(sayilar); // kaydettik

        System.out.println(Arrays.toString(sayilar)); // yazdık



    }

    public static int[] elementSagaKaydirma(int[] arr){

        int temp=arr[arr.length-1];

        for (int i = arr.length-1; i >=1 ; i--) {
            arr[i]=arr[i-1];

        }

        arr[0]=temp;

        return arr;
    }

}
