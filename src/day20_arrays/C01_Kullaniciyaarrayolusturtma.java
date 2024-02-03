package day20_arrays;

import day19_arrays.C02_ArrayinElemanlariniArttirma;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Kullaniciyaarrayolusturtma {
    public static void main(String[] args) {
        // Kullanicidan array in boyutunu ve tam sayı  elementlerini alip
        // array olusturan ve bize donduren bir method olusturun

        int[] benimarray=arrayOlustur(); // önce atama yaptık
        System.out.println("ilk array : "+ Arrays.toString(benimarray)); // yazdırdık

        // System.out.println("ikinci  array : "+Arrays.toString(arrayOlustur())); // direkt yazdırmak


        // benim arrayim deki tüm sayıları 4 arttırın

       benimarray =  C02_ArrayinElemanlariniArttirma.arrayelemanlariarttirma(benimarray,4);

        System.out.println(Arrays.toString(benimarray));


    }

    public static int[] arrayOlustur(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen array e kaç eleman koyacağınızı giriniz");
        int elemanSayisi=scanner.nextInt();

        int[] arr=new int[elemanSayisi];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array e eklemet için bir tam sayi giriniz");

            arr[i]=scanner.nextInt();

        }
        return arr;
    }
}
