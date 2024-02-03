package day28_passByValue;

import java.util.Arrays;

public class C05_PassBayValueCokElementliYapilar {

    // bir den fazla elementli bir yapı varsa elemanlar degişirse degişir
    // array veya slist degişirse sadece o degişir (boyut veya elaman sayısı olarak )sonra geri aynı şekilde yazılır
    public static void main(String[] args) {

        int[] arr={3,4,5};

        // verilen int array in elementlerinin degerlerini 2 arttırıp
        // arrayin yeni halini yazdıran bir method olusturun

        System.out.println("MEthod kol öncesi : "+Arrays.toString(arr));
        elementDegeriArttirma(arr);

        System.out.println("MEthod kol sonrası : "+Arrays.toString(arr));

        // verilen Array e 5 elemanlı yeni bir array atayıp yeni halini yazdıran bir method olulşturun

        System.out.println(" ikinci MEthod kol öncesi : "+Arrays.toString(arr));
        yeniArrayAtaMethodu(arr);

        System.out.println(" ikinci MEthod kol sonrası : "+Arrays.toString(arr));

    }

    public static void elementDegeriArttirma(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+2;
        }

        System.out.println("Method da Array in degeri : "+Arrays.toString(arr));
    }

    public static void yeniArrayAtaMethodu(int [] arr){
        arr=new int[5];
        System.out.println("İkinci methoddat arr : "+Arrays.toString(arr));

    }

}
