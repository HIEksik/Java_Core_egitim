package day20_arrays;

import java.util.Arrays;

public class C04_ArrayeElementEkleme {
    public static void main(String[] args) {
        //Verilen bir array’e istenen bir elemani ekleyip
        // bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.

        int [] arr={6,3,7};

     //  int eklenecekEleman=1;

     //  // Once 4 kişilik bir array oluşturacagız

     //  int [] yeniArr=new int[arr.length+1]; // [0,0,0,0]

     //  // bir forlup oluşturup
     //  // eski array deki tüm elementleri yeni array a kopyalayalım

     //  for (int i = 0; i < arr.length; i++) {
     //      yeniArr[i]=arr[i];
     //  }

     //  // en son element olarak yeni array e eklenecek sayıyı atayalım

     //  yeniArr[yeniArr.length-1]=eklenecekEleman;

     //  arr =yeniArr;

     //  System.out.println(Arrays.toString(arr));

        int eklenecek=5;

        int[] yeniArr=new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }

        yeniArr[yeniArr.length-1]=eklenecek;

        arr=yeniArr;

        System.out.println(Arrays.toString(arr));

        // array e yeni eleman olarak  9 ekleyelim

        arr=arrayElementEkley(arr,9);
        arr=arrayElementEkley(arr,5);
        arr=arrayElementEkley(arr,7);
        arr=arrayElementEkley(arr,3);

        System.out.println(Arrays.toString(arr));




    }

    public static int[] arrayElementEkley(int[] arr,int ekleneceksayi){
        // önce uzunlugu eski arrayden bir fazla olan yeni arry oluşturalım

        int [] yeniArr=new int[arr.length+1];

        // eski array deki tüm elementleri yeni arraye atayalım for ile


        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }

        // en son element olarak eklenecek olan sayıyı atayalım

        yeniArr[yeniArr.length-1]=ekleneceksayi;


        return yeniArr;



    }

}
